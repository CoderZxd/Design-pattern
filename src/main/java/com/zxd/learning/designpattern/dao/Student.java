package com.zxd.learning.designpattern.dao;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.dao
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:53 2018/2/13.
 */
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
