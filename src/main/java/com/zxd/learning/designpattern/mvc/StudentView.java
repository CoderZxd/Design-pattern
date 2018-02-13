package com.zxd.learning.designpattern.mvc;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.mvc
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:17 2018/2/13.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
