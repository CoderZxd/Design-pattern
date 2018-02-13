package com.zxd.learning.designpattern.nullobject;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.nullobject
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:06 2018/2/13.
 */
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
