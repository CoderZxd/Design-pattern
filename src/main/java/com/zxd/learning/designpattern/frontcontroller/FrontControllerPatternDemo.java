package com.zxd.learning.designpattern.frontcontroller;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.frontcontroller
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:03 2018/2/13.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
