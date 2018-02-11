package com.zxd.learning.designpattern.abstractfactorypattern;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.abstractfactorypattern
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:25 2018/2/11.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if("SHAPE".equalsIgnoreCase(type)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(type)){
            return new ColorFactory();
        }
        return null;
    }

}
