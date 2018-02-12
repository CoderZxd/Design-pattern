package com.zxd.learning.designpattern.prototype;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.prototype
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:21 2018/2/12.
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
