package com.imooc.exception;

import com.imooc.constant.ResultEnum;

/**
 * Created by liubao on 2018/7/1.
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
