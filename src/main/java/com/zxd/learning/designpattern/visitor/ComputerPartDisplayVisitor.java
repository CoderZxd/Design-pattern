package com.zxd.learning.designpattern.visitor;


/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.visitor
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:54 2018/2/13.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
