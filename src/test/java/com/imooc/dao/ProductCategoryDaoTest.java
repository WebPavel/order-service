package com.imooc.dao;


import com.imooc.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liubao on 2018/6/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOne() {
        ProductCategory productCategory = productCategoryDao.findOne(1);
        System.out.println(productCategory);
    }
    @Test
    @Transactional
    public void saveTest() {
//        ProductCategory productCategory =productCategoryDao.findOne(2);
        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(10);
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        ProductCategory result = productCategoryDao.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,10);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}