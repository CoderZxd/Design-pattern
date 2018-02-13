package com.zxd.learning.designpattern.chain;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.chain
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 9:41 2018/2/13.
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
