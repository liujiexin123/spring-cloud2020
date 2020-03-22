package com.liujiexin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * ClassName PaymentMain8081
 *
 * @Description 支付模块启动类
 * @Author liu jiexin
 * Date 2020/3/17 0017 0:11
 * @Version 1.0
 **/
@SpringBootApplication
public class PaymentMain8081
{
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8081.class,args);

    }

}
