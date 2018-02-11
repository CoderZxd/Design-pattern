package com.zxd.learning.designpattern.factory;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: Design-pattern
 * @Package com.zxd.learning.designpattern.factory
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-02-11 0:53
 **/
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
