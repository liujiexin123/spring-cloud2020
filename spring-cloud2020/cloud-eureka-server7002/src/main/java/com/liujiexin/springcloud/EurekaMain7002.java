package com.liujiexin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName EurekaMain7001
 *
 * @Description eureka 启动类
 * @Author liu jiexin
 * Date 2020/4/6 0006 17:41
 * @Version 1.0
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
    public static void main(String args[]){
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
