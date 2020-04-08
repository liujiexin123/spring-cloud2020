package com.liujiexin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName PaymentMain8001
 *
 * @Description 支付模块启动类
 * @Author liu jiexin
 * Date 2020/3/17 0017 0:11
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }

}
