package com.lover.javahib.util;

/**
 * 封装返回结果对象
 */
public class Result {

    /**
     * 返回编码
     */
    private Long code;

    /**
     * 返回结果字符串
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public Result(Long code, String msg) {

    }

    public Result(Long code, Object data) {
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
