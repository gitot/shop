package com.guyot.shop.svc.member.web;

import com.guyot.shop.api.dto.WechatDto;
import com.guyot.shop.svc.member.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/v1/member")
public class WechatSvcController {

    @Autowired
    private IDemoService demoService;

    @GetMapping(value = "/getWechatInfo")
    public WechatDto getWechatInfo() {
        return demoService.memberToWechat();
    }
}
