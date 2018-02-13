package com.zxd.learning.designpattern.state;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.state
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:50 2018/2/13.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
