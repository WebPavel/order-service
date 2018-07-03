package com.imooc.constant;

import lombok.Getter;

/**
 * 订单状态
 * Created by liubao on 2018/7/1.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    OrderStatusEnum(2,"已取消"),
    ;
    private Integer code;
    private String message;
    OrderStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
