package com.guyot.shopping.api.wechat;

import com.guyot.shopping.api.dto.WechatDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 微信接口
 * @date 2020/4/6
 */
@FeignClient(name = "wechat-service",path = "/v1/wechat")
public interface IWechatServiceApi {
    /**
     * @return dto
     */
    @GetMapping("/getWechatInfo")
    WechatDto getWechatInfo();
}
