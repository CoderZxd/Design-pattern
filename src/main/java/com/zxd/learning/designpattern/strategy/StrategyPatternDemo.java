package com.zxd.learning.designpattern.strategy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.strategy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:27 2018/2/13.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
