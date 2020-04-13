package cn.freefly.springboot.tokenAuth.config;

import cn.freefly.springboot.tokenAuth.interceptor.AuthInterceptor;
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
    //让bean提前加载
    @Bean
    public HandlerInterceptor getInterceptor(){
        return new AuthInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getInterceptor()).addPathPatterns("/**");
    }
}
