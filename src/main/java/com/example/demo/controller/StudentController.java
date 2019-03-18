package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.util.Result;
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
    public Result  saveStudent(@RequestBody Student student){

        return studentService.saveStudent(student);
    }

    /**
     *查询数据列表
     * @return
     */
    @GetMapping("/student/list")
    public Result  getStudentList( Student student){

        return studentService.getStudentList(student);
    }

    /**
     *根据id查询
     * @return
     */
    @RequestMapping("/student/save")
    public Result  getStudentById(@PathVariable Long id){

        return studentService.getStudentById(id);
    }
}
