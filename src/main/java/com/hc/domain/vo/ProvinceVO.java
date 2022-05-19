package com.hc.domain.vo;

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
public class ProvinceVO {
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
}