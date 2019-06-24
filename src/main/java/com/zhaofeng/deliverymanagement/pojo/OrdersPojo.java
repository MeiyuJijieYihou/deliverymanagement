package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.entity.Cement;
import com.zhaofeng.deliverymanagement.entity.User;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("OrdersPojo")
public class OrdersPojo {
    private Integer id;

    private User customer;

    private Cement cement;

    private Double unitPrice;

    private Double num;

    private Date createdTime;

    private Boolean status;
}
