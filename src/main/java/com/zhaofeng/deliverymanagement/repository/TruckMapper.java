package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.dto.TruckDTO;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import io.swagger.models.auth.In;

import java.util.List;

public interface TruckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Truck record);

    int insertSelective(Truck record);

    Truck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Truck record);

    int updateByPrimaryKey(Truck record);

        /**
     * 根据用户id获取车辆
     *
     * @param
     * @return
     */
    List<TruckDTO> selectByUserId(Integer userId);

    /**
     * 根据用户id获取指定车牌号的数量
     *
     * @param
     * @return
     */
    Integer countByUserIdAnLicensePlate(Integer userId, String licensePlate);

    List<TruckDTO> selectBySearchParam(Integer userId, String licensePlate);


    void updateRecentUsageTimeAndUsageCount(Integer id);
}