package com.zxd.learning.designpattern.singleton.lazy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.lazy
 * @Author：zouxiaodong
 * @Description:懒汉式，线程不安全
 * @Date:Created in 17:05 2018/2/11.
 */
public class SingletonForLazyUnsafe {

    private static SingletonForLazyUnsafe instance;

    private SingletonForLazyUnsafe(){}

    public static SingletonForLazyUnsafe getInstance(){
        if(null == instance){
            instance = new SingletonForLazyUnsafe();
        }
        return instance;
    }
}
