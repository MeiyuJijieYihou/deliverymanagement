package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.entity.Orders;
import com.zhaofeng.deliverymanagement.entity.Truck;
import com.zhaofeng.deliverymanagement.entity.User;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("DeliveryPojo")
public class DeliveryPojo {
    private Integer id;

    private Truck truck;

    private User driver;

    private List<Orders> ordersList;

    private List<User> loaderList;

    private Date deliveryTime;
}
