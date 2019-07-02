package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/7/2
 */

@Data
public class AddressParam implements InputConverter<Address> {
    private String addressName;

    private Integer customerId;
}
