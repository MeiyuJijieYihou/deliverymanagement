package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Truck;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */

public interface TruckService {
    JsonResult getByTruckId(Integer truckId);

    JsonResult getByUserId(Integer userId);

    JsonResult addTruck(Truck truck);

    JsonResult updateTruck(Truck truck);
}
