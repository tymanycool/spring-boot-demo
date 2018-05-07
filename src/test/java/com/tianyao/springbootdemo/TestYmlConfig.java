package com.tianyao.springbootdemo;


import com.tianyao.springbootdemo.service.HelloService;
import com.tianyao.springbootdemo.service.HelloService2;
import com.tianyao.springbootdemo.yml.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
public class TestYmlConfig {
    @Value("${person.dog.age}")
    private String age;

    @Value("${test}")
    private String test;

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloService2 helloService2;

    @Test
    public void test(){
        System.out.println(person);
        System.out.println(age);
        System.out.println(test);
        System.out.println(ioc.containsBean("helloService"));
        System.out.println(ioc.containsBean("helloService2"));
    }
}
