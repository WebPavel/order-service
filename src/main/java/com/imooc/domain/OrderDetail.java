package com.imooc.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by liubao on 2018/7/1.
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    /** 订单id */
    private String orderId;
    /** 商品id */
    private String productId;
    /** 商品名称 */
    private String productName;
    /** 商品单价 */
    private BigDecimal productPrice;
    /** 商品数量 */
    private Integer productQuantity;
    /** 商品略缩图 */
    private String productIcon;
    private Date createTime;
    private Date updateTime;
}
