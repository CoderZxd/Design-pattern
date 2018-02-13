package com.zxd.learning.designpattern.intercepting;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.intercepting
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:14 2018/2/13.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
