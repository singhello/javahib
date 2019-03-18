package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpaRepository<Student, Long>
 *     Student：要操作的表格
 *     Long：ID
 *
 *     继承的这个类里面封装了基本的增删改查方法直接调用即可
 */
public interface StudentRepository extends JpaRepository<Student, Long> {


}
