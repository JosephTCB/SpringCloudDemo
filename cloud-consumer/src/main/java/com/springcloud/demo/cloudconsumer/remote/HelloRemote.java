package com.springcloud.demo.cloudconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "spring-cloud-provider")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String sayHello();
}
