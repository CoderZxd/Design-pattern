package com.zxd.learning.designpattern.bridge;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.bridge
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:04 2018/2/12.
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
