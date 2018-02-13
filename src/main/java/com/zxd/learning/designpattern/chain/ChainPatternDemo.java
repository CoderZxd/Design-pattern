package com.zxd.learning.designpattern.chain;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.chain
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 9:44 2018/2/13.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug information.");
        System.out.println("------------------------------------------------------");
        loggerChain.logMessage(AbstractLogger.INFO,"This is an info information.");
        System.out.println("------------------------------------------------------");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }
}
