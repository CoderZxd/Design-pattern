package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:24 2018/2/12.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
