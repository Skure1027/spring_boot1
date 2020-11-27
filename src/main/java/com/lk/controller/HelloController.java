package com.lk.controller;


import com.lk.pojo.JP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(JP.class)
public class HelloController {


    @Autowired
    private JP jp;

    @RequestMapping("hi")
    public String saystring() {
        System.out.println(jp);
        return "hi boot";

    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello,world";
    }
}
