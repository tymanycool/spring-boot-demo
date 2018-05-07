package com.tianyao.springbootdemo.config;

import com.tianyao.springbootdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Autowired
    RestTemplateBuilder builder;
    /**
     * 向Spring中添加组件
     * @return
     */
    @Bean
    HelloService helloService(){
        return new HelloService();
    }

    @Bean
    RestTemplate restTemplate(){
        return builder.build();
    }
}
