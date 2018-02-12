package com.zxd.learning.designpattern.bridge;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.bridge
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:05 2018/2/12.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    abstract void draw();
}
