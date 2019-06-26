package com.zhaofeng.deliverymanagement.model.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class PasswordParam {

    @NotBlank(message = "旧密码不能为空")
    @Size(max = 64, message = "密码的字符长度不能超过 {max}")
    private String oldPassword;

    @NotBlank(message = "新密码不能为空")
    @Size(max = 64, message = "密码的字符长度不能超过 {max}")
    private String newPassword;

}

