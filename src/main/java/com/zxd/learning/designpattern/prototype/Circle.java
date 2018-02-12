package com.zxd.learning.designpattern.prototype;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.prototype
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:23 2018/2/12.
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
