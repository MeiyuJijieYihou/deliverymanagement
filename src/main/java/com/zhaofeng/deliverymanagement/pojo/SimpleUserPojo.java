package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import org.apache.ibatis.type.Alias;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */
@Alias("SimpleUserPojo")
public class SimpleUserPojo {
    private Integer id;

    private String username;

    private String realname;

    private String phone;

    private Job job;

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
}
