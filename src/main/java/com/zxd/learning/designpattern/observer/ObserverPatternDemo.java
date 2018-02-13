package com.zxd.learning.designpattern.observer;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.observer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:35 2018/2/13.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
