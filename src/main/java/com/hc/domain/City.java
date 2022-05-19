package com.hc.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 城市表
    */
@ApiModel(value="com-hc-domain-City")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class City {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Integer id;

    /**
    * 城市名
    */
    @ApiModelProperty(value="城市名")
    private String name;

    /**
    * 省编号
    */
    @ApiModelProperty(value="省编号")
    private Integer provinceId;

    /**
    * 显示优化级
    */
    @ApiModelProperty(value="显示优化级")
    private Integer priority;

    /**
    * 状态：1正常 0 删除
    */
    @ApiModelProperty(value="状态：1正常 0 删除")
    private Integer status;
}