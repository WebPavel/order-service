package com.imooc.dao;

import com.imooc.domain.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by liubao on 2018/7/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterDao;

    private final String OPENID = "110110";

    @Test
    public void tesSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("liubao");
        orderMaster.setBuyerPhone("13212749412");
        orderMaster.setBuyerAddress("shanghaisongjiang");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(45));
        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void testFindByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0,3);
        Page<OrderMaster> orderMasterPage = orderMasterDao.findByBuyerOpenid(OPENID,pageRequest);
        Assert.assertNotEquals(0,orderMasterPage.getTotalElements());
        System.out.println(orderMasterPage.getTotalElements());
        System.out.println(orderMasterPage.getTotalPages());
    }
}