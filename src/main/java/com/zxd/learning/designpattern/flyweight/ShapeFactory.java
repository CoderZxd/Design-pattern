package com.zxd.learning.designpattern.flyweight;

import java.util.HashMap;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.flyweight
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:55 2018/2/12.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>(16);
    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
