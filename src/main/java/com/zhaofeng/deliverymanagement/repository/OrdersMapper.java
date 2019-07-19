package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.pojo.OrdersPojo;

import java.util.Date;
import java.util.List;

public interface OrdersMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 根据用户id获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectOrdersByUserId(Integer userId);


    /**
     * 根据用户id获取所有未完成的订单
     *
     * @param
     * @return
     */
    List<OrdersPojo> selectUncompletedOrdersByUserId(Integer userId);

    /**
     * 根据用户id和客户id获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectOrdersByUserIdAndCustomerId(Integer userId, Integer customerId);

    /**
     * 设置订单所属发货记录
     *
     * @param
     * @return 
     */
    Integer updateDeliveryIdByOrderId(Integer id, Integer deliveryId);

    /**
     * 根据发货记录id获取订单，获取发货记录是要用到
     *
     * @param
     * @return
     */
    List<OrdersPojo> selectAllOrdersByDeliveryId(Integer deliveryId);
    
    
    /**
     * 根据搜索参数获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectBySearchParam(Integer userId, Integer scope, String realname, String addressName, Date fromDate, Date toDate);
}