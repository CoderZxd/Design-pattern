package com.zxd.learning.designpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.servicelocator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:28 2018/2/13.
 */
public class Cache {
    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
