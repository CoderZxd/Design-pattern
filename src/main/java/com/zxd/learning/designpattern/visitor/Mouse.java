package com.zxd.learning.designpattern.visitor;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.visitor
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:53 2018/2/13.
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
