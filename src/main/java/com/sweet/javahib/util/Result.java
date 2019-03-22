package com.sweet.javahib.util;


import java.util.ArrayList;
import java.util.List;

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
    private List<Object> data;

    public Result(Long code, String msg) {

    }

    public Result(Long code, Object data) {
        this.code = code;
        if(this.data == null){
            this.data  = new ArrayList<>();
        }
        this.data.add(data);
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

    public List <Object> getData() {
        return data;
    }

    public void setData(List <Object> data) {
        this.data = data;
    }
}
