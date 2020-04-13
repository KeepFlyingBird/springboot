package cn.freefly.springboot.tokenAuth.interceptor;

import cn.freefly.springboot.tokenAuth.service.AuthToken;
import cn.freefly.springboot.tokenAuth.utils.RedisUtil;
import cn.freefly.springboot.tokenAuth.utils.TokenConstant;
import com.alibaba.fastjson.JSONObject;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import redis.clients.jedis.Jedis;

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
public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private RedisUtil redisUtil;

    //存放鉴权信息的Header名称，默认是Authorization
    private String httpHeaderName = "Authorization";

    //鉴权失败后返回的错误信息，默认为401 unauthorized
    private String unauthorizedErrorMessage = "401 unauthorized";

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
        // 如果打上了AuthToken注解则需要验证token
        if (method.getAnnotation(AuthToken.class) != null || handlerMethod.getBeanType().getAnnotation(AuthToken.class) != null) {
            String token = request.getHeader(httpHeaderName);
            Object username = null;
            if (token != null && token.length() != 0) {
                username = redisUtil.get(token);
            }
            log.info("token :{}, userName:{}", token,username);
            if (username != null && !username.toString().trim().equals("")) {
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
                request.setAttribute(REQUEST_CURRENT_KEY, username);
                return true;
            } else {
                JSONObject jsonObject = new JSONObject();
                PrintWriter out = null;
                try {
                    response.setStatus(unauthorizedErrorCode);
                    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                    jsonObject.put("code", ((HttpServletResponse) response).getStatus());
                    jsonObject.put("message", HttpStatus.UNAUTHORIZED);
                    out = response.getWriter();
                    out.println(jsonObject);
                    return false;
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
        request.setAttribute(REQUEST_CURRENT_KEY, null);
        return true;
    }
}
