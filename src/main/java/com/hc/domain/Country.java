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
    * 县区表
    */
@ApiModel(value="com-hc-domain-Country")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Integer id;

    /**
    * 乡镇名
    */
    @ApiModelProperty(value="乡镇名")
    private String name;

    /**
    * 所属城市编号
    */
    @ApiModelProperty(value="所属城市编号")
    private Integer cityId;

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