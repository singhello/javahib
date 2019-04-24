package com.sweet.javahib.util;


import java.util.ArrayList;

/**
 * 封装返回结果对象  试试
 */
public class Result {

    /**
     * 返回编码
     */
    private Long code;

    /**
     * 返回结果字符串
     */
    private String msg = "操作成功";

    /**Java是区分数据类型的不同于js，嗯 我知道，在ts中 也是区分数据类型的  其中又any任意类型Java中没有这个类型 欧克Java中Object是代表所有类型的父类都可以用他来表示（不建议，只有不明确数据类型的时候使用） 嗯
     * 还有问题吗 木有了那我去研究页面了 嗯tk
     * 返回数据  数据格式的问题，我现在是不是哪个data传啥，返回的就是啥 对 Object就是什么都可以 any是啥任意类型的哪个 var是Java11的但是现在没用过
     */
    private Object data;

    /**
     * 错误信息传参code和msg
     * @param code
     * @param msg
     */
    public Result(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 正确信息传参code和data
     * @param code
     * @param data
     */
    public Result(Long code, Object data) {
        this.code = code;//data这个  本身查询的话  就是list类型，下面又add了一下
        if(this.data == null){
            this.data  = new ArrayList<>();
        }
        this.data=data;//
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
