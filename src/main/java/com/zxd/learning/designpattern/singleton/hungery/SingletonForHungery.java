package com.zxd.learning.designpattern.singleton.hungery;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton
 * @Author：zouxiaodong
 * @Description:饿汉式
 * @Date:Created in 16:57 2018/2/11.
 */
public class SingletonForHungery {

    private static SingletonForHungery instance = new SingletonForHungery();

    private SingletonForHungery(){}

    public static SingletonForHungery getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello single pattern!!");
    }
}
