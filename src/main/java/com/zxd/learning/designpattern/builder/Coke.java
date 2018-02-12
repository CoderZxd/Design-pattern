package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:25 2018/2/12.
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
