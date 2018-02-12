package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:17 2018/2/12.
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
