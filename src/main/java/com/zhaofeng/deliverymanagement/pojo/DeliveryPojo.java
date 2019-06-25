package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.model.entity.User;
import org.apache.ibatis.type.Alias;

import java.text.SimpleDateFormat;
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

    private List<Orders> orderList;

    private List<User> loaderList;

    private Date deliveryTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    public List<User> getLoaderList() {
        return loaderList;
    }

    public void setLoaderList(List<User> loaderList) {
        this.loaderList = loaderList;
    }

    public String getDeliveryTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(deliveryTime);
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
