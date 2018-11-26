package com.hiya.boot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <!-- SpringBoot 打包成war包，部署到tomcat -->
 * @author zjq
 *
 */
public class SpringBootStartApplication extends SpringBootServletInitializer 
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) 
    {
        return builder.sources(HiyaSpringBoot1ProApplication.class);
    }
}