package com.tianyao.springbootdemo.controller;

import com.tianyao.springbootdemo.yml.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void testSayHello(){
        //System.out.println(restTemplate);
        String ret = restTemplate.getForObject("http://localhost:8080/sayHello", String.class);
        System.out.println(ret);
    }
    @Test
    public void testSayHello2(){
        //System.out.println(restTemplate);
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8080/sayHello", String.class);
        System.out.println("testSayHello2:"+forEntity);
    }

    @Test
    public void testGetDog(){
        Dog dog = restTemplate.getForObject("http://localhost:8080/getDog", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void testUpdateDog(){
        Dog oldDog = new Dog();
        oldDog.setAge(20);
        oldDog.setLastName("xiaoming");
        Map<String, Object> map = new HashMap<>();
        map.put("age",30);
        map.put("lastName","xiaoming");
        Dog dog = restTemplate.postForObject("http://localhost:8080/updateDog",oldDog, Dog.class);
        System.out.println(dog);
    }

    @Test
    public void testUpdateDog2(){
        Dog oldDog = new Dog();
        oldDog.setAge(20);
        oldDog.setLastName("xiaoming");
        Map<String, Object> map = new HashMap<>();
        map.put("age",30);
        map.put("lastName","xiaoming");
        Dog dog = restTemplate.postForObject("http://localhost:8080/updateDog",map, Dog.class);
        System.out.println(dog);
    }
}
