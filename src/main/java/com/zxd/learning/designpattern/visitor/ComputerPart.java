package com.zxd.learning.designpattern.visitor;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.visitor
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:50 2018/2/13.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
