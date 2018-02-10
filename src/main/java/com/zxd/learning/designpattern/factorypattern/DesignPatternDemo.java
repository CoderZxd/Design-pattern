package com.zxd.learning.designpattern.factorypattern;

/**
 * @author CoderZZ
 * @Title: DesignPatternDemo
 * @Project: Design-pattern
 * @Package com.zxd.learning.designpattern.factorypattern
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-02-11 1:02
 **/
public class DesignPatternDemo {
    public static void main(String[] args){
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
