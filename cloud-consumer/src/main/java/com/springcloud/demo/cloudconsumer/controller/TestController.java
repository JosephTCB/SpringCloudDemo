package com.springcloud.demo.cloudconsumer.controller;

import com.springcloud.demo.cloudconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String sayHello(){
        return helloRemote.sayHello();
    }
}
