package com.imooc.dao;

import com.imooc.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liubao on 2018/7/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    private OrderDetailDao orderDetailDao;
    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("102");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("123457");
        orderDetail.setProductName("茶虾");
        orderDetail.setProductPrice(new BigDecimal(65.00));
        orderDetail.setProductQuantity(2);
        orderDetail.setProductIcon("http://xx.cn/12.jpg");

        OrderDetail result = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void testFindByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = orderDetailDao.findByOrderId("123456");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}