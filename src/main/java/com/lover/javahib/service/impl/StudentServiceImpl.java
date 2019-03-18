package com.lover.javahib.service.impl;

import com.lover.javahib.dao.StudentRepository;
import com.lover.javahib.entity.Student;
import com.lover.javahib.service.StudentService;
import com.lover.javahib.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 接口实现类：负责实现接口里面的抽象方法
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource(name = "studentRepository")
    private StudentRepository repository;


    /**
     * 保存学生方法实现
     * @param student
     * @return
     */
    @Override
    public Result saveStudent(Student student) {

        repository.save(student);

        return new Result((long) 200,"新增成功！");
    }

    /**
     * 查询学生列表
     * @param student
     * @return
     */
    @Override
    public Result getStudentList(Student student) {

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
        Student student = repository.getOne(id);
        return new Result((long) 200,student);
    }
}
