package com.liujiexin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName OrderMain80
 *
 * @Description TODO
 * @Author liu jiexin
 * Date 2020/4/1 0001 0:38
 * @Version 1.0
 **/

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
