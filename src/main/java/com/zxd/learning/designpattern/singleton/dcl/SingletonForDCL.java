package com.zxd.learning.designpattern.singleton.dcl;


/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.dcl
 * @Author：zouxiaodong
 * @Description:双检锁/双重校验锁（DCL，即 double-checked locking）.
 *              这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * @Date:Created in 17:22 2018/2/11.
 */
public class SingletonForDCL {

    private volatile static SingletonForDCL instance;

    private SingletonForDCL(){}

    public static SingletonForDCL getInstance(){
        if(null == instance){
            synchronized (SingletonForDCL.class){
                if(null == instance){
                    instance = new SingletonForDCL();
                }
            }
        }
        return instance;
    }
}
