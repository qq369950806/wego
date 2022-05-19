package com.hc.ex;

import lombok.Getter;

import java.util.Map;

/**
 * 非法的参数异常
 */
public class WeGoArgumentException extends RuntimeException {

    /**
     * map封装了错误的信息
     */
    @Getter
    private Map<String, String> map;

    public WeGoArgumentException(Map<String, String> map) {
        this.map = map;
    }

}
