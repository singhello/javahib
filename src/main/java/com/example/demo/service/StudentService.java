package com.example.demo.service;


import com.example.demo.entity.Student;
import com.example.demo.util.Result;

/**
 * 接口层:负责逻辑处理访问数据库层
 */
public interface StudentService {
    /**
     * 保存学生数据
     * @param student
     * @return
     */
    Result saveStudent(Student student);

    /**
     * 查询学生列表
     * @param student
     * @return
     */
    Result getStudentList(Student student);

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    Result getStudentById(Long id);
}
