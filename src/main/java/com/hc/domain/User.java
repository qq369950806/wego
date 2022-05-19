package com.hc.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 用户表
    */
@ApiModel(value="com-hc-domain-User")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Long id;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String avatar;

    /**
    * 性别：1女 2男 3未知
    */
    @ApiModelProperty(value="性别：1女 2男 3未知")
    private Integer gender;

    /**
    * 生日
    */
    @ApiModelProperty(value="生日")
    private LocalDate birth;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String account;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 电话
    */
    @ApiModelProperty(value="电话")
    private String tel;

    /**
    * 邮箱
    */
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
    * QQ
    */
    @ApiModelProperty(value="QQ")
    private String qq;

    /**
    * 微信
    */
    @ApiModelProperty(value="微信")
    private String wechat;

    /**
    * 外键：角色编号
    */
    @ApiModelProperty(value="外键：角色编号")
    private Integer roleId;

    /**
    * 优先级（活跃度）
    */
    @ApiModelProperty(value="优先级（活跃度）")
    private Integer priority;

    /**
    * 收货地址个数，默认最多13个
    */
    @ApiModelProperty(value="收货地址个数，默认最多13个")
    private Integer receiveAddrs;

    /**
    * 状态：1未激活，2激活，功能受限
    */
    @ApiModelProperty(value="状态：1未激活，2激活，功能受限")
    private Integer status;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
    * 更新日期
    */
    @ApiModelProperty(value="更新日期")
    private LocalDateTime updateTime;
}