package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.repository.TruckMapper;
import com.zhaofeng.deliverymanagement.service.TruckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */

@Service
public class TruckServiceImpl implements TruckService {

    @Resource
    private TruckMapper truckMapper;

    @Override
    public JsonResult getByUserId(Integer userId) {
        List<Truck> truckList = truckMapper.selectByUserId(userId);
        if (truckList == null || truckList.isEmpty()) {
            return new JsonResult("无结果");
        }
        return new JsonResult(truckList);
    }

    @Override
    public JsonResult addTruck(Truck truck) {
        truckMapper.insert(truck);
        return new JsonResult();
    }

    @Override
    public JsonResult updateTruck(Truck truck) {
        truckMapper.updateByPrimaryKey(truck);
        return new JsonResult();
    }
}
