package com.guyot.shopping.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author guyot
 * @version 1.0.0-SNAPSHOT
 * @desc 微信dto
 * @date 2020/4/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WechatDto {
    private String appId;
    private String appName;
    private Integer port;

}
