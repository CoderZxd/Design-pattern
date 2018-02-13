package com.zxd.learning.designpattern.servicelocator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.servicelocator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:28 2018/2/13.
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
