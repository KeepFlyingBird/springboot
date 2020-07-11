package cn.freefly.springboot.filter_intercept_aspect_listener.filter.config;

import cn.freefly.springboot.filter_intercept_aspect_listener.filter.utils.ReqResFilter;
import cn.freefly.springboot.filter_intercept_aspect_listener.filter.utils.ReqResFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassNmae WebConfig
 * @Author xiao.yunfei
 * @Date 2020/4/22 16:59
 * @Desc
 */
@Configuration
public class WebFilterConfig {
    @Bean
    public FilterRegistrationBean reqResFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        ReqResFilter reqResFilter = new ReqResFilter();
        filterRegistrationBean.setFilter(reqResFilter);
        //配置多个过滤规则
//        List<String> urls = new ArrayList<>();
//        urls.add("/order/*");
//        urls.add("/user/*");
//        filterRegistrationBean.setUrlPatterns(urls);
        filterRegistrationBean.addUrlPatterns("/*");//配置过滤规则
        filterRegistrationBean.setName("reqResFilter");//设置过滤器名称
        filterRegistrationBean.setOrder(2);//执行次序
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean reqResFilter1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        ReqResFilter1 reqResFilter1 = new ReqResFilter1();
        filterRegistrationBean.setFilter(reqResFilter1);
        filterRegistrationBean.addUrlPatterns("/*");//配置过滤规则
        filterRegistrationBean.addInitParameter("name","reqResFilter1");//设置init参数
        filterRegistrationBean.setName("reqResFilter1");//设置过滤器名称
        filterRegistrationBean.setOrder(1);//执行次序
        return filterRegistrationBean;
    }
}
