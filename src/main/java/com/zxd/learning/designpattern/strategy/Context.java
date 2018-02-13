package com.zxd.learning.designpattern.strategy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.strategy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:22 2018/2/13.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
