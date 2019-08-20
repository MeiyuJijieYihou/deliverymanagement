package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.dto.TruckDTO;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import io.swagger.models.auth.In;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TruckMapper extends Mapper<Truck> {

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