package com.zxd.learning.designpattern.prototype;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.prototype
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:31 2018/2/12.
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("circle");
        System.out.println(circle.getType());

        Shape square = ShapeCache.getShape("square");
        System.out.println(square.getType());

        Shape rectangle = ShapeCache.getShape("rectangle");
        System.out.println(rectangle.getType());
    }
}
