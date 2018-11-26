package com.hiya.boot;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hiya.boot.interceptor.HiyaInterceptor1;
import com.hiya.boot.interceptor.HiyaInterceptor2;
import com.hiya.boot.servlet.HiyaServletByRegistrationBean;

@Configuration
public class HiyaConfigure implements WebMvcConfigurer  
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        return new ServletRegistrationBean(new HiyaServletByRegistrationBean(), "/servlet/hiyaServletByRegistrationBean");
    }
    
    /**
     * 添加拦截器 
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) 
    {
        registry.addInterceptor(new HiyaInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new HiyaInterceptor2()).addPathPatterns("/**");
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/orange").setViewName("success");
    }
    
    /**
     * 添加静态资源映射 
     * 重启项目，访问：http://localhost:8080/hiya/c.jpg 能正常访问static目录下的c.jpg图片资源。
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/hiya/**").addResourceLocations("classpath:/static/");
    }
}