package com.hiya.boot.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2) 
public class HiyaStartupRunner1 implements CommandLineRunner
{
    @Override
    public void run(String... args) throws Exception
    {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
    }
}