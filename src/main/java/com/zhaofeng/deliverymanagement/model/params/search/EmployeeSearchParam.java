package com.zhaofeng.deliverymanagement.model.params.search;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */

@Data
public class EmployeeSearchParam extends CustomerSearchParam {
    private Integer jobId;
}
