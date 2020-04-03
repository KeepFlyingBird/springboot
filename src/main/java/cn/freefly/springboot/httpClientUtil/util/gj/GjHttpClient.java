package cn.freefly.springboot.httpClientUtil.util.gj;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.devUtils.UUIDUtil;
import cn.freefly.springboot.httpClientUtil.config.gj.ChannelGjFundModeConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundServerConfig;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResFlagE;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResponseCode;
import cn.freefly.springboot.httpClientUtil.service.PathConfigService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 * @Author houjianhui
 * @Description 国金http请求前加解密代理类
 * @Date 14:33 2020/2/25
 * @Param
 * @return
 **/
@Component
@Slf4j
public class GjHttpClient {

    @Autowired
    private PathConfigService pathConfigService;

    public BaseResponse post(String url, Object data, String applicationName, GjFundServerConfig serverConfig) {
        GjChannelConfig channelConfig = pathConfigService.findGjChannelConfig(applicationName);
        if (Objects.isNull(channelConfig)) {
            log.info("渠道{}配置在平台不存在或者未启动", applicationName);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_NOT_EXISTED);
        }
        // 获取资方分配渠道信息
        ChannelGjFundModeConfig fundModeConfig = channelConfig.getFundModeConfig();

        String result = post(url, data, fundModeConfig, serverConfig);
        return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.SUCCESS.getCode(), null, result);
    }

    public String post(String url, Object data, ChannelGjFundModeConfig channelFundConfig, GjFundServerConfig serverConfig) {
        Map<String, Object> requestParamMap = BeanUtils.beanToMap(data);
        log.info("requestParamMap：{}", JsonUtil.toJson(requestParamMap));
        requestParamMap.put("appId", channelFundConfig.getAppId());
        requestParamMap.put("clientId", channelFundConfig.getClientId());
        requestParamMap.put("authType", "VERIFYSIGN");
        requestParamMap.put("nonceStr", UUIDUtil.uuidLower());
        requestParamMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        String signStr = generateSign(requestParamMap, serverConfig);
        requestParamMap.put("sign", signStr);
        log.info("request data: {}", JsonUtil.toJson(requestParamMap));
        String requestUrl = serverConfig.getHost().concat(url);
        String responseStr = post(requestUrl, JsonUtil.toJson(requestParamMap));
        log.info("response data: {}", responseStr);
        return responseStr;
    }

    private String post(String url, String data) {
        String result = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        log.info("请求地址Url: {}", url);
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
        HttpResponse httpResponse = null;
        try {
            StringEntity stringEntity = new StringEntity(data, "UTF-8");
            httpPost.setEntity(stringEntity);
            httpResponse = httpclient.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            result = EntityUtils.toString(entity, "UTF-8");
        } catch (ClientProtocolException e) {
            log.error(e.getMessage(), e);
            log.error("http状态编码=" + httpResponse.getStatusLine().getStatusCode() + "");
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return result;
    }


    /**
     * @return java.lang.String
     * @Author houjianhui
     * @Description 生成签名
     * @Date 14:49 2020/2/25
     * @Param []
     **/
    private String generateSign(Map<String, Object> data, GjFundServerConfig serverConfig) {
        log.info("signParam：{}", JsonUtil.toJson(data));
        String signTemp = getStrBySortASCII(data) + "clientSecret=" + serverConfig.getSecret();
        log.info("signTemp: {}", signTemp);
        try {
            String sign = DigestUtils.md5Hex(signTemp.getBytes("utf-8")).toUpperCase();
            log.info("sign: {}", sign);
            return sign;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author houjianhui
     * @Description 获取ASCII 码从小到大排序（字典序）
     * @Date 14:49 2020/2/25
     * @Param [map]
     **/
    public static String getStrBySortASCII(Map<String, Object> map) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != "") {
                if (entry.getValue() instanceof String) {
                    list.add(entry.getKey() + "=" + entry.getValue() + "&");
                } else {
                    list.add(entry.getKey() + "=" + JsonUtil.toJson(entry.getValue()) + "&");
                }
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        return result;
    }
}
