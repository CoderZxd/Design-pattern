package com.zxd.learning.designpattern.nullobject;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.nullobject
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:03 2018/2/13.
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(String iname:names){
            if(iname.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
