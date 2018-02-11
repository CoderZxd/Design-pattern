package com.zxd.learning.designpattern.singleton.enumeration;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.singleton.enumeration
 * @Author：zouxiaodong
 * @Description:枚举单例(单元素的枚举类型已经成为实现Singleton的最佳方法。)
 * @Date:Created in 18:15 2018/2/11.
 */
public enum SingletonForEnum {
    INSTANCE;
    private Resource resource;
    SingletonForEnum(){
        resource = new Resource();
    }
    public Resource getResource(){
        return resource;
    }
}
