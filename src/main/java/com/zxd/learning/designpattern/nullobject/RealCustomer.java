package com.zxd.learning.designpattern.nullobject;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.nullobject
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:02 2018/2/13.
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
