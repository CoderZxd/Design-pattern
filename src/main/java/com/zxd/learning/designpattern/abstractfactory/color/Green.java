package com.zxd.learning.designpattern.abstractfactory.color;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactory.color
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:12 2018/2/11.
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
