package com.zxd.learning.designpattern.abstractfactory.shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactory
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:06 2018/2/11.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
