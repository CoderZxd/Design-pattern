package com.zxd.learning.designpattern.businessdelegate;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.businessdelegate
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:38 2018/2/13.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
