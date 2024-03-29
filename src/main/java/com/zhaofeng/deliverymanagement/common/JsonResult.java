package com.zhaofeng.deliverymanagement.common;


import java.io.Serializable;

/**
 * 返回对象. <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/3
 */
public class JsonResult<T> implements Serializable {
    private T data;
    private int status;
    private String message;

    /**
     * 若没有数据返回，默认状态码为 0，提示信息为“操作成功！”
     */
    public JsonResult() {
        this.status = RtCode.SUCCESS;
        this.message = "success";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param status
     * @param msg
     */
    public JsonResult(int status, String msg) {
        this.status = status;
        this.message = msg;
    }

    /**
     * 有数据返回时，状态码为 0，默认提示信息为“操作成功！”
     * @param data
     */
    public JsonResult(T data) {
        this.data = data;
        this.status = RtCode.SUCCESS;
        this.message = "success";
    }

    /**
     * 有数据返回，状态码为 0，人为指定提示信息
     * @param data
     * @param msg
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.status = RtCode.SUCCESS;
        this.message = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return status;
    }

    public void setCode(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
