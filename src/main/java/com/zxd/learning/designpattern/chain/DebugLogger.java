package com.zxd.learning.designpattern.chain;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.chain
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 9:43 2018/2/13.
 */
public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Console::Logger: " + message);
    }
}
