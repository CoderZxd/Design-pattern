package com.zxd.learning.designpattern.facade;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.facade
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:13 2018/2/12.
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
