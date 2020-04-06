package com.guyot.shopping.svc.member.service.impl;

import com.guyot.shopping.api.dto.WechatDto;
import com.guyot.shopping.api.wechat.IWechatServiceApi;
import com.guyot.shopping.svc.member.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 微信service实现demo
 * @date 2020/4/6
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private IWechatServiceApi wechatServiceApi;

    public WechatDto memberToWechat() {
        return wechatServiceApi.getWechatInfo();
    }
}
