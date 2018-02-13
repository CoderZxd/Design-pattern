package com.zxd.learning.designpattern.transfer;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.transfer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:42 2018/2/13.
 */
public class StudentVO {
    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo) {
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
