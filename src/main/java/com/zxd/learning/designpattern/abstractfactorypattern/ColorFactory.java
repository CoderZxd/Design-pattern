package com.zxd.learning.designpattern.abstractfactorypattern;

import com.zxd.learning.designpattern.abstractfactorypattern.color.Blue;
import com.zxd.learning.designpattern.abstractfactorypattern.color.Color;
import com.zxd.learning.designpattern.abstractfactorypattern.color.Green;
import com.zxd.learning.designpattern.abstractfactorypattern.color.Red;
import com.zxd.learning.designpattern.abstractfactorypattern.shape.Shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactorypattern
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
