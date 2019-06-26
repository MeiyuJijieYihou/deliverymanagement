package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */
@Data
public class OrdersParam implements InputConverter<Orders> {
    @NotNull(message = "客户id不能为空")
    private Integer customerId;

    @NotNull(message = "地址id不能为空")
    private Integer addressId;

    @NotNull(message = "水泥id不能为空")
    private Integer cementId;

    @NotNull(message = "单价不能为空")
    private Double unitPrice;

    @NotNull(message = "数量不能为空")
    private Double num;

    @NotNull(message = "所属用户id不能为空")
    private Integer userId;
}
