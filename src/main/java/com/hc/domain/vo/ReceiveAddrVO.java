package com.hc.domain.vo;

import com.hc.domain.ReceiveAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
public class ReceiveAddrVO {
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
     * 省份
     */
    @ApiModelProperty(value="省份")
    private String province;
    /**
     * 城市
     */
    @ApiModelProperty(value="城市")
    private String city;

    /**
    * 县区
    */
    @ApiModelProperty(value="县区")
    private String country;

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

    public static ReceiveAddrVO doamin2VO(ReceiveAddr receiveAddr) {
        if (receiveAddr == null) {
            return null;
        }
        ReceiveAddrVO receiveAddrVO = new ReceiveAddrVO();
        receiveAddrVO.setId(receiveAddr.getId());
        receiveAddrVO.setReceiver(receiveAddr.getReceiver());
        receiveAddrVO.setAddr(receiveAddr.getAddr());
        receiveAddrVO.setPostcode(receiveAddr.getPostcode());
        receiveAddrVO.setTel(receiveAddr.getTel());
        return receiveAddrVO;
    }
}