package cn.freefly.springboot.filter_intercept_aspect_listener.filter.utils;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassNmae ReqResFilter
 * @Author xiao.yunfei
 * @Date 2020/4/22 16:54
 * @Desc
 */
@Slf4j
public class ReqResFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化过滤器：ReqResFilter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("执行过滤器：ReqResFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器：ReqResFilter");
    }
}
