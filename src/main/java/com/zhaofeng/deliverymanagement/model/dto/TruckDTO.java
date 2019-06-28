package com.zhaofeng.deliverymanagement.model.dto;

import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/6/27
 */

@Data
public class TruckDTO {
    private Integer id;

    private String licensePlate;

    private String maxCapacity;
}
