package com.zxd.learning.designpattern.servicelocator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.servicelocator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:29 2018/2/13.
 */
public class ServiceLocator {
    private static Cache cache;
    static {
        cache = new Cache();
    }
    public static Service getService(String jndiName){
        Service service = cache.getService(jndiName);
        if(service != null){
            return service;
        }
        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
