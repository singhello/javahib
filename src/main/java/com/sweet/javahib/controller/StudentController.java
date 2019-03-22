package com.sweet.javahib.controller;

import com.sweet.javahib.entity.Student;
import com.sweet.javahib.service.StudentService;
import com.sweet.javahib.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 业务控制层处理请求路劲
 */
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     *保存一条数据到数据库
     * @return
     */
    @PostMapping("/student/save")
    public Result saveStudent(@RequestBody Student student){

        return studentService.saveStudent(student);
    }

    /**
     *查询数据列表
     * @return
     */
    @GetMapping("/student/list")
    public Result  getStudentList(){

        return studentService.getStudentList();
    }

    /**
     *根据id查询
     * @return
     */
    @RequestMapping("/student/select/{id}")
    public Result  getStudentById(@PathVariable Long id){

        return studentService.getStudentById(id);
    }

    /**
     * 查询所有学生
     * @return
     */
    @GetMapping("student/allList")
    public Result getAllStudent(){
        return studentService.getAllStudent();
    }
}
