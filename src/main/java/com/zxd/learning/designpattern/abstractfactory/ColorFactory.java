package com.zxd.learning.designpattern.abstractfactory;

import com.zxd.learning.designpattern.abstractfactory.color.Blue;
import com.zxd.learning.designpattern.abstractfactory.color.Color;
import com.zxd.learning.designpattern.abstractfactory.color.Green;
import com.zxd.learning.designpattern.abstractfactory.color.Red;
import com.zxd.learning.designpattern.abstractfactory.shape.Shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactory
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:23 2018/2/11.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(null == color){
            return null;
        }
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        }else if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }else if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}
