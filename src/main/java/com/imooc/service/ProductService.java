package com.imooc.service;

import com.imooc.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by liubao on 2018/6/29.
 */

public interface ProductService {
    ProductInfo findOne(String productId);
    /**
     * 查询所有在架的商品列表
     *
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //库存增加
    void increaseStock(List<>) {

    }
    //库存减少
}
