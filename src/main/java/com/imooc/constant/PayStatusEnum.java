package com.imooc.constant;

import lombok.Getter;

/**
 * Created by liubao on 2018/7/1.
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"未支付"),
    SUCCESS(2,"支付成功"),
    ;
    private Integer code;
    private String message;
    PayStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
