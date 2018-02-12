package com.zxd.learning.designpattern.decorator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.decorator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:40 2018/2/12.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
