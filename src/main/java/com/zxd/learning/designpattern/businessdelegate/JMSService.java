package com.zxd.learning.designpattern.businessdelegate;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.businessdelegate
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:38 2018/2/13.
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
