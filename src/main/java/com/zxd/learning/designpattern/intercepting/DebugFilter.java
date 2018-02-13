package com.zxd.learning.designpattern.intercepting;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.intercepting
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:12 2018/2/13.
 */
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
