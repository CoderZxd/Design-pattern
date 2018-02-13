package com.zxd.learning.designpattern.state;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.state
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:52 2018/2/13.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
