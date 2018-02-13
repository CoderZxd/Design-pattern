package com.zxd.learning.designpattern.strategy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.strategy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:22 2018/2/13.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
