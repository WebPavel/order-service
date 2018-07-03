package com.imooc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by liubao on 2018/6/28.
 */
@Entity
@DynamicUpdate
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    /** 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名字 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
