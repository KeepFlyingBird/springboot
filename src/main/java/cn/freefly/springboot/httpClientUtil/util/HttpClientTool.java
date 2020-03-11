package cn.freefly.springboot.httpClientUtil.util;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.httpClientUtil.config.ServerConfigConstant;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @ClassNmae HttpClientTool
 * @Author xiao.yunfei
 * @Date 2020/3/5 22:37
 * @Desc
 */
@Component
@Slf4j
public class HttpClientTool {
    public BaseResponse post(String postUrl,Object reqObj){
        String result = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(postUrl);
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
        HttpResponse httpResponse = null;
        try {
            //在http1.1中，client和server都是默认对方支持长链接的， 如果client使用http1.1协议，但又不希望使用长链接，
            //则需要在header中指明connection的值为close；如果server方也不想支持长链接，
            //则在response中也需要明确说明connection的值为close.
            httpPost.setHeader(HttpHeaders.CONNECTION, "close");
            StringEntity stringEntity = new StringEntity(JsonUtil.toJson(reqObj), "UTF-8");
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
        return BaseResponse.createBaseResponse(true, result);
    }
}
