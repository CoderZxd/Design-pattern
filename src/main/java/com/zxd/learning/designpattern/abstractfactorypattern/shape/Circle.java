package com.zxd.learning.designpattern.abstractfactorypattern.shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactorypattern
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:06 2018/2/11.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
