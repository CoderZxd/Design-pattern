package com.zxd.learning.designpattern.businessdelegate;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.businessdelegate
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:39 2018/2/13.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
