package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.entity.Cement;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.vo.OrdersDetailVO;
import com.zhaofeng.deliverymanagement.repository.OrdersMapper;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("OrdersPojo")
public class OrdersPojo {
    private Integer id;

    private String customerName;

    private String addressName;

    private String cementName;

    private Double unitPrice;

    private Double num;

    private Date createdTime;

    private Integer deliveryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getCementName() {
        return cementName;
    }

    public void setCementName(String cementName) {
        this.cementName = cementName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     * 返回类型为字符串的日期
     *
     * @param
     * @return 
     */
    public String getCreatedTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(createdTime);
    }


//    public OrdersDetailVO convertToDetailVO() {
//        OrdersDetailVO ordersDetailVO = new OrdersDetailVO();
//        ordersDetailVO.setId(id);
//        ordersDetailVO.setCustomerName(customer.getRealname());
//        ordersDetailVO.setAddressName(address.getAddressName());
//        ordersDetailVO.setCementName(cement.getName());
//        ordersDetailVO.setUnitPrice(unitPrice);
//        ordersDetailVO.setNum(num);
//        ordersDetailVO.setCreatedTime(createdTime);
//        ordersDetailVO.setDeliveryId(deliveryId);
//        return ordersDetailVO;
//    }

}
