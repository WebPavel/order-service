package com.imooc.utils;


import java.util.Random;

/**
 * 生成唯一主键
 * 格式：时间+随机数
 * Created by liubao on 2018/7/1.
 */
public class KeyUtil {
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
