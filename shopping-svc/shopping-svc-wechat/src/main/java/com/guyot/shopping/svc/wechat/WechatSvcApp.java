package com.guyot.shopping.svc.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.eureka.ConditionalOnRibbonAndEurekaEnabled;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 微信服务
 * @date 2020/4/6
 */
@SpringBootApplication
@EnableEurekaClient
public class WechatSvcApp {
    public static void main(String[] args) {
        SpringApplication.run(WechatSvcApp.class, args);
    }

}
