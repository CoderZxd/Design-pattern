package com.zxd.learning.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.command
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:40 2018/2/13.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>(10);

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }

}
