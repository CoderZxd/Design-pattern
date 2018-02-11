package com.zxd.learning.designpattern.abstractfactory;

import com.zxd.learning.designpattern.abstractfactory.color.Color;
import com.zxd.learning.designpattern.abstractfactory.shape.Circle;
import com.zxd.learning.designpattern.abstractfactory.shape.Rectangle;
import com.zxd.learning.designpattern.abstractfactory.shape.Shape;
import com.zxd.learning.designpattern.abstractfactory.shape.Square;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactory
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:19 2018/2/11.
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        if(null == shape){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
