package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:15 2018/2/12.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
