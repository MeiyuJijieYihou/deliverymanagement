package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.model.params.TruckParam;
import com.zhaofeng.deliverymanagement.service.TruckService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */

@RestController
@RequestMapping("/api/truck")
public class TruckController {
    @Autowired
    private TruckService truckService;

    @GetMapping()
    public JsonResult getAllTruck() {
        return new JsonResult("空数据");
    }

    @GetMapping("/user")
    @ApiOperation("根据用户id获取车辆信息")
    public JsonResult getTruckByUserId(@ApiParam("用户id") @RequestParam("userId")  Integer userId) {
        return truckService.getByUserId(userId);
    }

    @PostMapping("/add")
    @ApiOperation("添加车辆")
    public JsonResult add(@ApiParam("车辆信息") @Valid TruckParam truckParam) {
        Truck truck = truckParam.convertTo();
        return truckService.addTruck(truck);
    }

    @PostMapping("/update")
    @ApiOperation("更新车辆信息")
    public JsonResult update(@ApiParam("用户输入的车辆信息") @Valid TruckParam truckParam,
                             @ApiParam("车辆id") @RequestParam("truckId") Integer truckId) {
        Truck truck = new Truck();
        truck.setId(truckId);
        truckParam.update(truck);
        return truckService.updateTruck(truck);
    }
}
