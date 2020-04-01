package com.liujiexin.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName ApplicationContextConfig
 *
 * @Description TODO
 * @Author liu jiexin
 * Date 2020/4/1 0001 0:47
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
