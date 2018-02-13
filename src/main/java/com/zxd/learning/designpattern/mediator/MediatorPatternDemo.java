package com.zxd.learning.designpattern.mediator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.mediator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:44 2018/2/13.
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
