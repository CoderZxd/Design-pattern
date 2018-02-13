package com.zxd.learning.designpattern.businessdelegate;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.businessdelegate
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:40 2018/2/13.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
