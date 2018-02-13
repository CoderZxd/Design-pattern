package com.zxd.learning.designpattern.state;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.state
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:50 2018/2/13.
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }

}
