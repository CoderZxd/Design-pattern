package com.zxd.learning.designpattern.observer;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.observer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:34 2018/2/13.
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
