package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.service.TruckService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    private TruckService truckService;

    @GetMapping()
    public JsonResult getAllTruck() {
        return new JsonResult("空数据");
    }

    @GetMapping("/user")
    @ApiOperation("根据用户id获取车辆信息")
    public JsonResult getTruckByUserId(@RequestParam("userId") Integer userId) {
        return truckService.getByUserId(userId);
    }

    @PostMapping("/add")
    @ApiOperation("添加车辆")
    public JsonResult add(Truck truck) {
        return truckService.addTruck(truck);
    }

    @PostMapping("/update")
    @ApiOperation("更新车辆信息")
    public JsonResult update(Truck truck) {
        return truckService.updateTruck(truck);
    }
}
