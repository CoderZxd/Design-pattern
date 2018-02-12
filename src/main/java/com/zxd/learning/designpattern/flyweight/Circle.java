package com.zxd.learning.designpattern.flyweight;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.flyweight
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:54 2018/2/12.
 */
public class Circle implements Shape{

    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
