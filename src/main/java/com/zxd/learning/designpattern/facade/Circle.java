package com.zxd.learning.designpattern.facade;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: Design-pattern
 * @Package com.zxd.learning.designpattern.factory
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-02-11 0:54
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}
