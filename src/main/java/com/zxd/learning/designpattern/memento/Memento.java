package com.zxd.learning.designpattern.memento;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.memento
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 13:59 2018/2/13.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
