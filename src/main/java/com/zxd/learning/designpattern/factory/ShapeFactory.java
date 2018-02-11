package com.zxd.learning.designpattern.factory;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: Design-pattern
 * @Package com.zxd.learning.designpattern.factory
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-02-11 0:55
 **/
public class ShapeFactory {

    /**
     * class_name: ShapeFactory
     * param: String shapeType
     * describe: TODO
     * creat_user: CoderZZ
     * creat_date: 2018-02-11
     * creat_time: 1:01
     **/
    public static Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
