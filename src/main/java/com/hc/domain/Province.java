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
    * 省份表
    */
@ApiModel(value="com-hc-domain-Province")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Province {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Integer id;

    /**
    * 省名
    */
    @ApiModelProperty(value="省名")
    private String name;

    /**
    * 所属地区
    */
    @ApiModelProperty(value="所属地区")
    private String area;

    /**
    * 显示优先级
    */
    @ApiModelProperty(value="显示优先级")
    private Integer priority;

    /**
    * 状态：1可用  2禁用
    */
    @ApiModelProperty(value="状态：1可用  2禁用")
    private Integer status;
}