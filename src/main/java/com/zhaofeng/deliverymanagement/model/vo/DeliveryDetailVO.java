package com.zhaofeng.deliverymanagement.model.vo;

import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class DeliveryDetailVO {
    private Integer id;

    private String licensePlate;

    private String driverName;

    private List<Orders> orderList;

    private List<User> loaderList;

    private Date deliveryTime;
}
