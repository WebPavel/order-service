package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liubao on 2018/6/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //此处LoggerTest可以更换随意，最好是当前类，方便查错
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
//        logger.debug("debug......");
//        logger.info("info.....");
//        logger.error("error.....");
        String name = "imooc";
        String password = "123456";
        log.debug("debug......");
        log.info("info.....");
        log.error("error.....");
        log.info("name: " + name + " password: " + password);
        log.info("name:{},password:{}" , name,password);
        log.warn("warning...");
    }
}
