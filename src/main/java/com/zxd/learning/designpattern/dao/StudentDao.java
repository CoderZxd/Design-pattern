package com.zxd.learning.designpattern.dao;

import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.dao
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:54 2018/2/13.
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
