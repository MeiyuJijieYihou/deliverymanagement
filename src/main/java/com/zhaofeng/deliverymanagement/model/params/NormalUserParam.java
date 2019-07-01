package com.zhaofeng.deliverymanagement.model.params;

import com.zhaofeng.deliverymanagement.model.base.InputConverter;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author zhaofeng
 * @date 2019/6/25
 */
@Data
public class NormalUserParam extends BaseUserMinimalParam {

    @NotBlank(message = "用户名不能为空")
    @Size(max = 20, message = "用户名的字符长度不能超过 {max}")
    private String username;

    @Size(min = 8, max = 20, message = "密码的字符长度必须在 {min} - {max} 之间")
    private String password;
}
