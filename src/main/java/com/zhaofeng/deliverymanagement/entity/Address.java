package com.zhaofeng.deliverymanagement.entity;

public class Address {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.address_name
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private String addressName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.id
     *
     * @return the value of address.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.id
     *
     * @param id the value for address.id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.address_name
     *
     * @return the value of address.address_name
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.address_name
     *
     * @param addressName the value for address.address_name
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.customer_id
     *
     * @return the value of address.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.customer_id
     *
     * @param customerId the value for address.customer_id
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}