package com.zhaofeng.deliverymanagement.model.entity;

public class Truck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck.id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck.license_plate
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    private String licensePlate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck.user_id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck.max_capacity
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    private Double maxCapacity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.id
     *
     * @return the value of truck.id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.id
     *
     * @param id the value for truck.id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.license_plate
     *
     * @return the value of truck.license_plate
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.license_plate
     *
     * @param licensePlate the value for truck.license_plate
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.user_id
     *
     * @return the value of truck.user_id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.user_id
     *
     * @param userId the value for truck.user_id
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.max_capacity
     *
     * @return the value of truck.max_capacity
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.max_capacity
     *
     * @param maxCapacity the value for truck.max_capacity
     *
     * @mbg.generated Tue Jun 25 20:44:02 CST 2019
     */
    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}