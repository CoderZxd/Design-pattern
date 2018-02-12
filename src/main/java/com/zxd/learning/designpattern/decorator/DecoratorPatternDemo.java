package com.zxd.learning.designpattern.decorator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.decorator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:44 2018/2/12.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle  = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
