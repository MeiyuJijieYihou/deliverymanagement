package com.zhaofeng.deliverymanagement.model.params.search;

import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */

@Data
public class CustomerSearchParam {
    private Integer ownerId;

    private String realname;

    private String phone;
}
