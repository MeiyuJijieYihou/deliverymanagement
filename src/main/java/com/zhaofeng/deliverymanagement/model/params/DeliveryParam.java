package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class DeliveryParam implements InputConverter<Delivery> {
    @NotNull(message = "车辆id不能为空")
    private Integer truckId;

    @NotNull(message = "司机id不能为空")
    private Integer driverId;

    @NotNull(message = "发货时间不能为空")
    private Date deliveryTime;

    @NotNull(message = "所属用户id不能为空")
    private Integer userId;

    @NotNull
    private Set<Integer> orderIds;

    @NotNull
    private Set<Integer> loaderIds;
}
