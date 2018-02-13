package com.zxd.learning.designpattern.interpreter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.interpreter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:02 2018/2/13.
 */
public class AndExpression implements Expression{

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
