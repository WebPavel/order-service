package com.imooc.service.impl;

import com.imooc.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * Created by liubao on 2018/6/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void testFindOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void testFindAll() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void testFindByCategoryTypeIn() throws Exception {
        List<Integer> list = Arrays.asList(2,3,10);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void testSave() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生专享");
        productCategory.setCategoryType(9);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
        //跳转至下一行Ctrl+shift+enter
    }
}