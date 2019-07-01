package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */

@Data
public class EmployeeParam extends BaseUserSimpleParam {

    @NotNull(message = "职位id不能为空")
    @Max(value = 8, message = "职位id长度不能超过 {value}")
    private Integer jobId;
}
