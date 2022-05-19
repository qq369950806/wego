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
    * 县区表
    */
@ApiModel(value="com-hc-domain-Country")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryVO {
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
}