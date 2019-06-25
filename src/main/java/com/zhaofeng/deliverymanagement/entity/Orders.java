package com.zhaofeng.deliverymanagement.entity;

import java.util.Date;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.address_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.cement_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer cementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.unit_price
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Double unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.num
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Double num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.created_time
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delivery_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer deliveryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.customer_id
     *
     * @return the value of orders.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.customer_id
     *
     * @param customerId the value for orders.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.address_id
     *
     * @return the value of orders.address_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.address_id
     *
     * @param addressId the value for orders.address_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.cement_id
     *
     * @return the value of orders.cement_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getCementId() {
        return cementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.cement_id
     *
     * @param cementId the value for orders.cement_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setCementId(Integer cementId) {
        this.cementId = cementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.unit_price
     *
     * @return the value of orders.unit_price
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.unit_price
     *
     * @param unitPrice the value for orders.unit_price
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.num
     *
     * @return the value of orders.num
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Double getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.num
     *
     * @param num the value for orders.num
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.created_time
     *
     * @return the value of orders.created_time
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.created_time
     *
     * @param createdTime the value for orders.created_time
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delivery_id
     *
     * @return the value of orders.delivery_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getDeliveryId() {
        return deliveryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delivery_id
     *
     * @param deliveryId the value for orders.delivery_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }
}