package com.zxd.learning.designpattern.servicelocator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.servicelocator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:27 2018/2/13.
 */
public class Service1 implements Service{
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
