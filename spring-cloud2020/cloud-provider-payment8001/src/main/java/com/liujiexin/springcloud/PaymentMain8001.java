package com.liujiexin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

/**
 * ClassName PaymentMain8001
 *
 * @Description 支付模块启动类
 * @Author liu jiexin
 * Date 2020/3/17 0017 0:11
 * @Version 1.0
 **/
@SpringBootApplication
public class PaymentMain8001
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }

}
