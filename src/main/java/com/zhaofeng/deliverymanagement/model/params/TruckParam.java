package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class TruckParam implements InputConverter<Truck> {

    @NotBlank(message = "车牌号不能为空")
    @Size(min = 7, max = 10, message = "车牌号的字符长度必须在 {min} - {max} 之间")
    private String licensePlate;

    @NotNull(message = "最大装载容量不能为空")
    @Min(value = 1, message = "最大装载容量不能小于 {value}")
    @Max(value = 100, message = "最大装载容量不能大于 {value}")
    private Double maxCapacity;

    @NotNull(message = "所属用户id不能为空")
    private Integer userId;
}
