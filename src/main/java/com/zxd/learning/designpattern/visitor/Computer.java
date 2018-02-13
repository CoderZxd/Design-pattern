package com.zxd.learning.designpattern.visitor;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.visitor
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:54 2018/2/13.
 */
public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
