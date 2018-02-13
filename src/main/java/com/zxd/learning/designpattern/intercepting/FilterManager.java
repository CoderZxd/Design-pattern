package com.zxd.learning.designpattern.intercepting;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.intercepting
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:13 2018/2/13.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
