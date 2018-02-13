package com.zxd.learning.designpattern.interpreter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.interpreter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:01 2018/2/13.
 */
public class OrExpression implements Expression{

    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expression_1, Expression expression_2) {
        this.expr1 = expression_1;
        this.expr2 = expression_2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
