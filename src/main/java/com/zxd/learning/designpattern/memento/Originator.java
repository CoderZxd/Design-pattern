package com.zxd.learning.designpattern.memento;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.memento
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:00 2018/2/13.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }

}
