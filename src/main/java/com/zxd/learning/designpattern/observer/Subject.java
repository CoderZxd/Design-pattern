package com.zxd.learning.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.observer
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:27 2018/2/13.
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>(10);
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observerList){
            observer.update();
        }
    }
}
