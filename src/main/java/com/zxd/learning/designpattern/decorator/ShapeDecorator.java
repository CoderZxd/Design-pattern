package com.zxd.learning.designpattern.decorator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.decorator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:40 2018/2/12.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
