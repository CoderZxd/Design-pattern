package com.zxd.learning.designpattern.servicelocator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.servicelocator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:29 2018/2/13.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
