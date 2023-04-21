package com.thingfly.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @ClassName AdminApp
 * @Description 启动类
 * @Author Nanf_bunan
 * @Time 2023/3/28 22:29
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class AdminApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class, args);
    }
}
