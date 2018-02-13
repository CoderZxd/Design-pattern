package com.zxd.learning.designpattern.visitor;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.visitor
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:56 2018/2/13.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
