package com.zxd.learning.designpattern.bridge;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.bridge
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:11 2018/2/12.
 */
public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
