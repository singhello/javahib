package com.example.demo.entity;

import javax.persistence.*;

/**
 * 学生类
 */
@Entity
@Table(name = "t_student")//表名
public class Student {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    /**
     * 姓名
     */
    @Column(name = "name")
    protected String name;

    /**
     * 年龄
     */
    @Column(name = "age")
    protected int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
