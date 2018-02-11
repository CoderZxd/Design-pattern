package com.zxd.learning.designpattern.singleton.staticinner;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.staticinner
 * @Author：zouxiaodong
 * @Description:登记式/静态内部类
 * @Date:Created in 17:48 2018/2/11.
 */
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public static void main(String[] args){
        System.out.println(Singleton.getInstance() == SingletonHolder.INSTANCE);
    }
}
