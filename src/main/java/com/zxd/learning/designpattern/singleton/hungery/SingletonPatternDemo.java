package com.zxd.learning.designpattern.singleton.hungery;

import com.zxd.learning.designpattern.singleton.hungery.SingletonForHungery;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:00 2018/2/11.
 */
public class SingletonPatternDemo {

    public static void main(String[] args){
        SingletonForHungery singleObject_1 = SingletonForHungery.getInstance();
        SingletonForHungery singleObject_2 = SingletonForHungery.getInstance();
        System.out.println("singleObject_1 == singleObject_2 ? "+(singleObject_1==singleObject_2));
        singleObject_1.showMessage();
        singleObject_2.showMessage();
    }
}
