package cn.freefly.springboot.httpClientUtil.util;

import cn.freefly.springboot.devUtils.GenerateNoUtils;
import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.devUtils.MD5;
import cn.freefly.springboot.devUtils.RSAUtils;
import cn.freefly.springboot.devUtils.error.ValidateException;
import cn.freefly.springboot.httpClientUtil.config.fund.FundConstant;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.RequestParams;
import cn.freefly.springboot.httpClientUtil.dto.ResponseParams;
import cn.freefly.springboot.httpClientUtil.dto.enums.ResultCodeE;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.json.Json;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Objects;

/**
 * @ClassNmae HttpClientTool
 * @Author xiao.yunfei
 * @Date 2020/3/5 22:37
 * @Desc
 */
@Component
@Slf4j
public class HttpClient {
    public static String CHAR_SET = "UTF-8";
    public BaseResponse post(String postUrl, RequestParams requestParams){
        //1、组装请求报文
        String reqStr = buildRequestBody(requestParams);
        //2、接口调取
        String resResult = post(postUrl,reqStr);
        return BaseResponse.createBaseResponse(true, resResult);
    }

    public String post(String url,String reqStr){
        String resResult = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
        HttpResponse httpResponse = null;
        try {
            //在http1.1中，client和server都是默认对方支持长链接的， 如果client使用http1.1协议，但又不希望使用长链接，
            //则需要在header中指明connection的值为close；如果server方也不想支持长链接，
            //则在response中也需要明确说明connection的值为close.
            httpPost.setHeader(HttpHeaders.CONNECTION, "close");
            StringEntity stringEntity = new StringEntity(reqStr, CHAR_SET);
            httpPost.setEntity(stringEntity);
            httpResponse = httpclient.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            resResult = EntityUtils.toString(entity, CHAR_SET);
            resResult = decrypt(resResult);
        } catch (ClientProtocolException e) {
            log.error(e.getMessage(), e);
            log.error("http状态编码=" + httpResponse.getStatusLine().getStatusCode() + "");
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            if(httpResponse != null) {
                EntityUtils.consumeQuietly(httpResponse.getEntity());
            }
            if(httpPost != null){
                httpPost.releaseConnection();
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return resResult;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/12 20:14
     * @MethodParameters
     * @Description 组装请求报文
    */
    private String buildRequestBody(RequestParams requestParams) {
        Object infoContentObj = requestParams.getInfoContent();
        String infoContent = encryptionHandle(infoContentObj);// 加密
        String signStr = signHandle(infoContent);
        requestParams.setRequestSeqNo(GenerateNoUtils.generateSequence());
        requestParams.setInfoContent(infoContent);
        requestParams.setInfoSign(signStr);
        return JsonUtil.toJson(requestParams);
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/12 20:11
     * @MethodParameters
     * @Description 请求报文加密
    */
    private String encryptionHandle(Object infoContentObj) {
        // JSON 串非必输项默认传空（例如："respMsg":""）
        String content = JSONObject.toJSONString(infoContentObj, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteNullStringAsEmpty);
        // 报文内容通过BASE64转码
        try {
            // 报文加密
            log.info("加密前报文：{}", content);
            content = RSAUtils.publicEncrypt(content, RSAUtils.getPublicKey(FundConstant.PublicKey));
            log.info("加密后报文：{}", content);
            content = new BASE64Encoder().encode(content.getBytes(CHAR_SET));
            log.info("通过BASE64转码后报文：{}", content);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return content;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/12 21:00
     * @MethodParameters
     * @Description 签名
     */
    private String signHandle(String infoContent) {
        String infoSign = MD5.getContentMD5(infoContent);
        log.info("请求内容加密后的签名：{}", infoSign);
        return infoSign;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/12 20:12
     * @MethodParameters
     * @Description 解密
    */
    private String decrypt(String responseResult) {
        String result = "";
        // 格式化对象
        ResponseParams responseParams = JsonUtil.parseObject(responseResult, ResponseParams.class);
        // 将响应数据体解码
        try {
            if (Objects.equals(ResultCodeE.交易成功.getRetCode(), responseParams.getRespCode()) && Objects.nonNull(responseParams.getInfoContent())) {
                String infoContent = responseParams.getInfoContent().toString();
                log.info("响应报文通过BASE64转码前：{}", infoContent);
                // 校验签名
                String infoSign = MD5.getContentMD5(infoContent);
                if (Objects.equals(infoSign, responseParams.getInfoSign())) {
                    byte[] bytes = Base64.getMimeDecoder().decode(infoContent);
                    result = new String(bytes, CHAR_SET);
                    log.info("响应报文通过BASE64转码后：{}", result);
                    // 解密
                    result = RSAUtils.privateDecrypt(result, RSAUtils.getPrivateKey(FundConstant.PrivateKey));
                    log.info("响应报文解密后：{}", result);
                } else {
                    String error = String.format("签名异常，平台：%s ---> 响应：%s", infoSign, responseParams.getInfoSign());
                    log.error(error);
                    throw new ValidateException(error);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        responseParams.setInfoContent(result);
        return responseParams.toString();
    }

}
