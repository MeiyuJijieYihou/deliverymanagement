package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.entity.Job;
import com.zhaofeng.deliverymanagement.entity.Role;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("UserPojo")
public class UserPojo {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String phone;

    private Job job;

    private List<Role> roleList;

    private List<String> addressList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }
}
