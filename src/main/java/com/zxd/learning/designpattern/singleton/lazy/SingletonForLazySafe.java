package com.zxd.learning.designpattern.singleton.lazy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.lazy
 * @Author：zouxiaodong
 * @Description:懒汉式，线程安全
 * @Date:Created in 17:10 2018/2/11.
 */
public class SingletonForLazySafe {

    private static SingletonForLazySafe instance;

    private SingletonForLazySafe(){}

    public static synchronized SingletonForLazySafe getInstance(){
        if(null == instance){
            instance = new SingletonForLazySafe();
        }
        return instance;
    }

}
