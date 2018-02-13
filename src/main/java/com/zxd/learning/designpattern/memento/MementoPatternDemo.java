package com.zxd.learning.designpattern.memento;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.memento
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:07 2018/2/13.
 */
public class MementoPatternDemo {
    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
