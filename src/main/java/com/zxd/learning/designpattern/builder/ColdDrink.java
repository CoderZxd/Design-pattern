package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:22 2018/2/12.
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();

}
