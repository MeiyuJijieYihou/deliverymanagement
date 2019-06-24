package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.entity.Address;
import com.zhaofeng.deliverymanagement.entity.Cement;
import com.zhaofeng.deliverymanagement.entity.User;
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

    private User customer;

    private Address address;

    private Cement cement;

    private Double unitPrice;

    private Double num;

    private Date createdTime;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cement getCement() {
        return cement;
    }

    public void setCement(Cement cement) {
        this.cement = cement;
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

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
