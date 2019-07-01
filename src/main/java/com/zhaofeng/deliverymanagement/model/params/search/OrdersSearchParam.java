package com.zhaofeng.deliverymanagement.model.params.search;

import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */

@Data
public class OrdersSearchParam extends BaseUserSearchParam {
    private Integer scope;

    private String addressName;
}
