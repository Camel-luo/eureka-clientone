package com.lyq.demo.controller;


import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyq
 * @date   : 2018/1/9
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("hello")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        System.out.println("********************************************");
        System.out.println("* request path: "+instance.getUri() + " host: "+instance.getHost()+" serviceid: "+instance.getServiceId());
        System.out.println("********************************************");
        return "Eureka-clientone";
    }

}
