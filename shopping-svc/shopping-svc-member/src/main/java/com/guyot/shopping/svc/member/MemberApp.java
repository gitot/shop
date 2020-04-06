package com.guyot.shopping.svc.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 会员程序入口
 * @date 2020/4/6
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.guyot.shopping"})
public class MemberApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class, args);
    }
}
