package com.lyq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 使用注解@EnableDiscoveryClient开启注册功能，激活Eureka的DiscoveryClient实现
 * @author : lyq
 * @date   : 2018/1/9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientoneApplication.class, args);
	}
}
