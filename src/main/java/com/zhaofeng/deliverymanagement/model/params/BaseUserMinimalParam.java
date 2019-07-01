package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */
@Data
public class BaseUserMinimalParam implements InputConverter<User> {

    @NotBlank(message = "真实姓名")
    @Size(max = 20, message = "真实姓名的字符长度不能超过 {max}")
    private String realname;

    @NotBlank
    @Size(min = 11, max = 16, message = "联系电话的字符长度必须在 {min} - {max}之间")
    private String phone;

    private String remark;
}
