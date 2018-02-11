package com.zxd.learning.designpattern.singleton.enumeration;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.enumeration
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 18:13 2018/2/11.
 */
public class Resource {

    private static String threadName = Thread.currentThread().getName();

    public void print(){
        System.out.println(threadName);
    }

    public static void main(String[] args){
        Resource resource_1 = SingletonForEnum.INSTANCE.getResource();
        resource_1.print();
        Resource resource_2 = SingletonForEnum.INSTANCE.getResource();
        resource_2.print();
        System.out.println(resource_1 == resource_2);
    }
}
