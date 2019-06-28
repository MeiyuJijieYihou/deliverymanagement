package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.exception.AlreadyExistsException;
import com.zhaofeng.deliverymanagement.model.dto.TruckDTO;
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
    public JsonResult getByTruckId(Integer truckId) {
        return null;
    }

    @Override
    public List<TruckDTO> getByUserId(Integer userId) {
        return truckMapper.selectByUserId(userId);
    }

    @Override
    public JsonResult addTruck(Truck truck) {
        int count = truckMapper.countByUserIdAnLicensePlate(truck.getUserId(), truck.getLicensePlate());
        if (count > 0) {
            throw new AlreadyExistsException("该车辆已存在").setErrorData(truck);
        }

        truckMapper.insert(truck);
        return new JsonResult();
    }

    @Override
    public JsonResult updateTruck(Truck truck) {

        truckMapper.updateByPrimaryKey(truck);
        return new JsonResult();
    }

    @Override
    public JsonResult deleteById(Integer id) {
        truckMapper.deleteByPrimaryKey(id);
        return new JsonResult();
    }
}
