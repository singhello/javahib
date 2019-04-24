package com.sweet.javahib.service.impl;

import com.sweet.javahib.dao.StudentRepository;
import com.sweet.javahib.entity.Student;
import com.sweet.javahib.service.StudentService;
import com.sweet.javahib.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 接口实现类：负责实现接口里面的抽象方法
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository repository;

    /**
     * 保存学生方法实现
     * @param student
     * @return
     */
    @Override
    public Result saveStudent(Student student) {
        System.out.println(student.toString());
        repository.save(student);
        return new Result((long) 200,student);
    }

    /**
     * 查询学生列表
     * @return
     */
    @Override
    public Result getStudentList() {

        //查询所有学生列表
        List<Student> list= repository.findAll();
        //list为返给前台需要处理的列表数据
        return new Result((long) 200,list);
    }

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    @Override
    public Result getStudentById(Long id) {
        Student student = repository.getStudentById(id);
        return new Result((long) 200,student);
    }

    @Override
    public Result getAllStudent() {
        //查询所有学生列表
        List<Student> list= repository.findAll();
        return new Result((long) 200,list);
    }
}
