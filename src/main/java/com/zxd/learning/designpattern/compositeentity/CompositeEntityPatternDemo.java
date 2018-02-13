package com.zxd.learning.designpattern.compositeentity;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.compositeentity
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:50 2018/2/13.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
