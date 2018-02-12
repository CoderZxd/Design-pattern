package com.zxd.learning.designpattern.facade;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.facade
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:10 2018/2/12.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
