package com.zxd.learning.designpattern.chain;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.chain
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 9:35 2018/2/13.
 */
public abstract class AbstractLogger {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;
    protected  int level;
    protected AbstractLogger nextLogger;

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write(String message);
}
