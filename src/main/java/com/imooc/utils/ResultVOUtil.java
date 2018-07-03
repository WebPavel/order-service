package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * Created by liubao on 2018/6/29.
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(200);
        resultVO.setMsg("success");
        return resultVO;
    }
    public static ResultVO success() {
        return success(null);
    }
    public static ResultVO error(Integer code,String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
