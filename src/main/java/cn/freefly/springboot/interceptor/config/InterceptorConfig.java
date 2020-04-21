package cn.freefly.springboot.interceptor.config;

import cn.freefly.springboot.interceptor.interceptor.TemplateInterceptor;
import cn.freefly.springboot.interceptor.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassNmae InterceptorConfig
 * @Author xiao.yunfei
 * @Date 2020/4/10 16:22
 * @Desc
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    public HandlerInterceptor getTemplateInterceptor(){
        return new TemplateInterceptor();
    }
    @Bean
    public HandlerInterceptor getAuthInterceptor(){
        return new AuthInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截指定路径请求
        registry.addInterceptor(getTemplateInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getAuthInterceptor()).addPathPatterns("/**");
    }
}
