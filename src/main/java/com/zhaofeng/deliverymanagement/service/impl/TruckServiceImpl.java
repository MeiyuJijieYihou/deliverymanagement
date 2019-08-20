package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.exception.AlreadyExistsException;
import com.zhaofeng.deliverymanagement.model.dto.TruckDTO;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.model.params.search.TruckSearchParam;
//import com.zhaofeng.deliverymanagement.repository.TruckMapper;
import com.zhaofeng.deliverymanagement.repository.TruckMapper;
import com.zhaofeng.deliverymanagement.service.TruckService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

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
        Example example = Example.builder(Truck.class)
                .where(Sqls.custom()
                        .andEqualTo("userId", truck.getUserId())
                        .andEqualTo("licensePlate", truck.getLicensePlate()))
                .build();

        int count = truckMapper.selectCountByExample(example);
        if (count > 0) {
            throw new AlreadyExistsException("该车辆已存在").setErrorData(truck);
        }

        truckMapper.insertSelective(truck);
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

    @Override
    public List<TruckDTO> getBySearchParam(TruckSearchParam t) {
        return truckMapper.selectBySearchParam(t.getUserId(), t.getLicensePlate());
    }
}
