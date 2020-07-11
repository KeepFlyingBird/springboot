package cn.freefly.springboot.filter_intercept_aspect_listener.filter.utils;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassNmae ReqResFilter1
 * @Author xiao.yunfei
 * @Date 2020/4/22 17:04
 * @Desc
 */
@Slf4j
public class ReqResFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化过滤器1：{},{}",filterConfig.getFilterName(),filterConfig.getInitParameter("name"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("执行过滤器1：ReqResFilter1");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器1：ReqResFilter1");
    }
}
