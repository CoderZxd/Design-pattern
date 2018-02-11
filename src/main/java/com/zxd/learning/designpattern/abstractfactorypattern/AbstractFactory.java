package com.zxd.learning.designpattern.abstractfactorypattern;

import com.zxd.learning.designpattern.abstractfactorypattern.color.Color;
import com.zxd.learning.designpattern.abstractfactorypattern.shape.Shape;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactorypattern
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:13 2018/2/11.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
