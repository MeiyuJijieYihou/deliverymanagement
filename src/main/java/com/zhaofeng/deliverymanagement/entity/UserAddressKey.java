package com.zhaofeng.deliverymanagement.entity;

public class UserAddressKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.user_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.address_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    private Integer addressId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.user_id
     *
     * @return the value of user_address.user_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.user_id
     *
     * @param userId the value for user_address.user_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.address_id
     *
     * @return the value of user_address.address_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.address_id
     *
     * @param addressId the value for user_address.address_id
     *
     * @mbg.generated Mon Jun 24 20:13:04 CST 2019
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}