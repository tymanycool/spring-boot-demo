package com.tianyao.springbootdemo.controller;

import com.tianyao.springbootdemo.yml.Dog;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("sayHello")
    public String sayHello(){
        return "HelloWorld!!!";
    }

    @RequestMapping("getDog")
    public Dog getDog(){
        Dog dog = new Dog();
        dog.setLastName("小黄");
        dog.setAge(30);
        return dog;
    }

    @RequestMapping("updateDog")
    public Dog updateDog(@RequestBody  Dog dog){
        dog.setAge(66);
        return dog;
    }

    @RequestMapping("updateDog2")
    public Dog updateDog2(@RequestBody Map map){
        Dog dog = new Dog();
        dog.setAge(66);
        dog.setLastName((String) map.get("lastName"));
        return dog;
    }
}
