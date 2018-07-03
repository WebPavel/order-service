package com.imooc.service.impl;

import com.imooc.constant.ResultEnum;
import com.imooc.dao.OrderDetailDao;
import com.imooc.dao.OrderMasterDao;
import com.imooc.domain.OrderDetail;
import com.imooc.domain.OrderMaster;
import com.imooc.domain.ProductInfo;
import com.imooc.dto.OrderDTO;
import com.imooc.exception.SellException;
import com.imooc.service.OrderService;
import com.imooc.service.ProductService;
import com.imooc.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by liubao on 2018/7/1.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;
    @Autowired
    private OrderMasterDao orderMasterDao;
    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        String orderId = KeyUtil.getUniqueKey();
        BigDecimal orderAmount =new BigDecimal(BigInteger.ZERO);
        //1.查询商品（数量、价格）
        for (OrderDetail orderDetail:orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //2.计算订单总价
            orderAmount = productInfo.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);
            //订单详情入库
            orderDetail.setDetailId(KeyUtil.getUniqueKey());
            orderDetail.setOrderId(orderId);
            BeanUtils.copyProperties(productInfo,orderDetail);
            orderDetailDao.save(orderDetail);
        }
        //3.写入订单数据库（orderMaster、orderDetail)
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(orderId);
        orderMaster.setOrderAmount(orderAmount);
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMasterDao.save(orderMaster);
        //4.扣库存数量
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, PageRequest pageRequest) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
