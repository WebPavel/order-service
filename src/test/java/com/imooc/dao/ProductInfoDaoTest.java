package com.imooc.dao;

import com.imooc.domain.ProductInfo;
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
 * Created by liubao on 2018/6/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    public void testFindByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = productInfoDao.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
    @Test
    public void testSave() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("营养美味");
        productInfo.setProductIcon("http://xx.cn/12.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = productInfoDao.save(productInfo);
        Assert.assertNotNull(result);
    }

}