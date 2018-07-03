package com.imooc.constant;

import lombok.Getter;

/**
 * Created by liubao on 2018/7/1.
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
