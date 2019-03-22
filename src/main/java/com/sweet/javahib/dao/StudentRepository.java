package com.sweet.javahib.dao;

import com.sweet.javahib.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 继承JpaRepository<Student, Long>
 *     Student：要操作的表格
 *     Long：ID
 *
 *     继承的这个类里面封装了基本的增删改查方法直接调用即可
 */
@Repository(value = "studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student getStudentById(Long id);
}
