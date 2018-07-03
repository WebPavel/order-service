package com.imooc.service;

import com.imooc.domain.ProductCategory;

import java.util.List;

/**
 * Created by liubao on 2018/6/28.
 */
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
