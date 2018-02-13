package com.zxd.learning.designpattern.businessdelegate;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.businessdelegate
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:39 2018/2/13.
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
