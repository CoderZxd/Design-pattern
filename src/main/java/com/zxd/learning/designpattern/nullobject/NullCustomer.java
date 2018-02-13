package com.zxd.learning.designpattern.nullobject;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.nullobject
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:03 2018/2/13.
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
