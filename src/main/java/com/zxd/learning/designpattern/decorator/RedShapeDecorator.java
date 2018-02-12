package com.zxd.learning.designpattern.decorator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.decorator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:43 2018/2/12.
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        System.out.println("Border Color: Red");
    }
}
