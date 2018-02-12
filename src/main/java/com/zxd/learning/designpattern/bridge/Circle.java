package com.zxd.learning.designpattern.bridge;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.bridge
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:08 2018/2/12.
 */
public class Circle extends Shape{

    private int x,y,radius;
    public Circle(int x,int y,int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
