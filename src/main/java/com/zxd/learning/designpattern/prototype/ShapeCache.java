package com.zxd.learning.designpattern.prototype;

import java.util.Hashtable;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.prototype
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:24 2018/2/12.
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeCache = new Hashtable<String, Shape>(16);

    public static Shape getShape(String id){
        Shape shape = shapeCache.get(id);
        Shape shapeClone = (Shape)shape.clone();
        System.out.println("shape:"+shape.hashCode());
        System.out.println("shapeClone:"+shapeClone.hashCode());
        return shapeClone;
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("circle");
        shapeCache.put("circle",circle);

        Square square = new Square();
        square.setId("square");
        shapeCache.put("square",square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeCache.put("rectangle",rectangle);
    }
}
