package com.hc.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
    * 用户地址表
    */
@ApiModel(value="com-hc-domain-ReceiveAddr")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveAddr {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 收货人姓名
    */
    @ApiModelProperty(value="收货人姓名")
    private String receiver;

    /**
    * 县区编号
    */
    @ApiModelProperty(value="县区编号")
    private Integer countryId;

    /**
    * 具体地址
    */
    @ApiModelProperty(value="具体地址")
    private String addr;

    /**
    * 邮编
    */
    @ApiModelProperty(value="邮编")
    private String postcode;

    /**
    * 电话
    */
    @ApiModelProperty(value="电话")
    private String tel;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Long userId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;

    /**
    * 使用的次数：默认地址为-1
    */
    @ApiModelProperty(value="使用的次数：默认地址为2147483647")
    private Integer times;
}