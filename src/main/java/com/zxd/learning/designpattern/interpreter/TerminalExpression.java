package com.zxd.learning.designpattern.interpreter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.interpreter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:59 2018/2/13.
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
