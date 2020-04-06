package com.guyot.shopping.svc.wechat.web;

import com.guyot.shopping.api.dto.WechatDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 微信接口控制器
 * @date 2020/4/6
 */
@RestController
@RequestMapping("/v1/wechat")
public class WechatSvcController {

    @Value("#{new Integer('${server.port}')}")
    private Integer port;

    @GetMapping(value = "/getWechatInfo")
    public WechatDto getWechatInfo() {

        return new WechatDto("1", "demo", port);
    }
}
