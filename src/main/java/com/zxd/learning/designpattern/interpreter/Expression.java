package com.zxd.learning.designpattern.interpreter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.interpreter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:59 2018/2/13.
 */
public interface Expression {
    boolean interpret(String context);
}
