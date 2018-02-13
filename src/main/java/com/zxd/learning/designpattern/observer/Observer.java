package com.zxd.learning.designpattern.observer;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.observer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:27 2018/2/13.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
