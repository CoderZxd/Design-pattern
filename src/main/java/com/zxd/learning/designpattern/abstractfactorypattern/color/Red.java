package com.zxd.learning.designpattern.abstractfactorypattern.color;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactorypattern.color
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:10 2018/2/11.
 */
public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
