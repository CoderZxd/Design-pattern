package com.zxd.learning.designpattern.abstractfactory;

import com.zxd.learning.designpattern.abstractfactory.color.Color;
import com.zxd.learning.designpattern.abstractfactory.shape.Shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactory
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:27 2018/2/11.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = abstractFactory.getShape("circle");
        circle.draw();
        Shape rectangle = abstractFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = abstractFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorAbstractFactory = FactoryProducer.getFactory("color");
        Color red = colorAbstractFactory.getColor("red");
        red.fill();
        Color green = colorAbstractFactory.getColor("green");
        green.fill();
        Color blue = colorAbstractFactory.getColor("blue");
        blue.fill();
    }
}
