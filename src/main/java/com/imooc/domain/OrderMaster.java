package com.imooc.domain;

import com.imooc.constant.OrderStatusEnum;
import com.imooc.constant.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by liubao on 2018/6/30.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /** 订单id */
    @Id
    private String orderId;
    /** 买家名字 */
    private String buyerName;
    /** 买家手机号 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认状态为新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 订单状态，默认未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
//    @Transient
//    private List<OrderDetail> orderDetailList;
}
