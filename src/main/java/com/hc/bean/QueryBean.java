package com.hc.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryBean {
    /**
     * 查询条件
     */
    private String key;
    /**
     * 查询的具体值
     */
    private String value;
}
