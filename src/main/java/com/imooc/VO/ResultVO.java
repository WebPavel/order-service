package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by liubao on 2018/6/29.
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回具体内容
     */
    private T data;
}
