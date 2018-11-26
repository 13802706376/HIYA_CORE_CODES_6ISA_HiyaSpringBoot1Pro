package com.hiya.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  
public class HiyaSpringBoot1ProApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HiyaSpringBoot1ProApplication.class, args);
    }
}
