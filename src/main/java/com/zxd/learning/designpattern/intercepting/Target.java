package com.zxd.learning.designpattern.intercepting;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.intercepting
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:13 2018/2/13.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
