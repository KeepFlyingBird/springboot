package cn.freefly.springboot.interceptor.interceptor;

import cn.freefly.springboot.interceptor.utils.AuthToken;
import cn.freefly.springboot.redis.util.RedisUtil;
import cn.freefly.springboot.tokenAuth.utils.TokenConstant;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * @ClassNmae AuthInterceptor
 * @Author xiao.yunfei
 * @Date 2020/4/10 15:41
 * @Desc
 */
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisUtil redisUtil;

    //存放鉴权信息的Header名称，默认是Authorization
    private String httpHeaderName = "Authorization";

    //鉴权失败后返回的HTTP错误码，默认为401
    private int unauthorizedErrorCode = HttpServletResponse.SC_UNAUTHORIZED;

    /**
     * 存放登录用户模型Key的Request Key
     */
    public static final String REQUEST_CURRENT_KEY = "REQUEST_CURRENT_KEY";


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if (method.getAnnotation(AuthToken.class) != null) {
            String token = request.getHeader(httpHeaderName);
            log.info("token:{}",token);
            Object username = null;
            if (token != null && token.length() != 0) {
                username = redisUtil.get(token);
            }
            if (username != null && !username.toString().trim().equals("")) {
                log.info("token :{}, userName:{}", token,username);
                Long tokeBirthTime = Long.valueOf(redisUtil.get(token+username).toString());
                log.info("token Birth time is: {}", tokeBirthTime);
                Long diff = System.currentTimeMillis() - tokeBirthTime;
                log.info("token is exist : {} ms", diff);
                if (diff > TokenConstant.TOKEN_RESET_TIME) {
                    redisUtil.expire(username.toString(), TokenConstant.TOKEN_EXPIRE_TIME);
                    redisUtil.expire(token, TokenConstant.TOKEN_EXPIRE_TIME);
                    log.info("Reset expire time success!");
                    Long newBirthTime = System.currentTimeMillis();
                    redisUtil.set(token + username, newBirthTime.toString());
                }
                return true;
            } else {
                // 返回前端Json字符串
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("code", ((HttpServletResponse) response).getStatus());
                jsonObject.put("message", HttpStatus.UNAUTHORIZED);
                returnBackJson(response,jsonObject.toJSONString());
                return false;
            }
        }
        request.setAttribute(REQUEST_CURRENT_KEY, null);
        return true;
    }
    public void returnBackJson(HttpServletResponse response,String jsonStr){
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }
    }
}
