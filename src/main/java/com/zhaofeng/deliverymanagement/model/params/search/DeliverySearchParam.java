package com.zhaofeng.deliverymanagement.model.params.search;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */
@Data
public class DeliverySearchParam extends BaseUserSearchParam {

    private String licensePlate;

}
