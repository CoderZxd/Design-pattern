package com.zxd.learning.designpattern.intercepting;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.intercepting
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:13 2018/2/13.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
