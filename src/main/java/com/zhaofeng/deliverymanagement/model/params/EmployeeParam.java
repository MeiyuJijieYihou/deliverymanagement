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
public class EmployeeParam implements InputConverter<User> {
    @NotBlank(message = "真实姓名不能为空")
    @Size(max = 20, message = "真实姓名的字符长度不能超过{max}")
    private String realname;

    @NotBlank
    @Size(min = 11, max = 16, message = "联系电话字符长度需在{min}到{max}之间")
    private String phone;

    @NotNull(message = "职位id不能为空")
    @Max(value = 8, message = "职位id长度不能超过{value}")
    private Integer jobId;

    @NotNull(message = "所属用户id不能为空")
    private Integer ownerId;
}
