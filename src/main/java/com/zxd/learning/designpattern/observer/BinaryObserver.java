package com.zxd.learning.designpattern.observer;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.observer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:31 2018/2/13.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
