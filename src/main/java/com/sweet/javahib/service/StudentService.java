package com.sweet.javahib.service;


import com.sweet.javahib.entity.Student;
import com.sweet.javahib.util.Result;

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
     * @return
     */
    Result getStudentList();

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    Result getStudentById(Long id);

    /**
     * 查询所有学生
     * @return
     */
    Result getAllStudent();
}
