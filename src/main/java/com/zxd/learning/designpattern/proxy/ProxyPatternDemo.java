package com.zxd.learning.designpattern.proxy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.proxy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 18:12 2018/2/12.
 */
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
    }
}
