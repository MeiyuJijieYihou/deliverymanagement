package com.zhaofeng.deliverymanagement.model.params;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Login param.
 *
 * @author zhaofeng
 * @date 2019/6/26
 */
@Data
@ToString
public class LoginParam {

    @NotBlank(message = "用户名不能为空")
    @Size(max = 20, message = "用户名的字符长度不能超过 {max}")
    private String username;

    @NotBlank(message = "登陆密码不能为空")
    @Size(max = 64, message = "用户密码字符长度不能超过 {max}")
    private String password;

}
