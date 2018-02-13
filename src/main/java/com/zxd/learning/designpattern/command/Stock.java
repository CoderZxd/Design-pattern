package com.zxd.learning.designpattern.command;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.command
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:36 2018/2/13.
 */
public class Stock {
    private String name = "AbcStock";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+",  Quantity: " + quantity +" ] sold");
    }
}
