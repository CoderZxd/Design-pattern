package com.zxd.learning.designpattern.command;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.command
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:43 2018/2/13.
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker= new Broker();
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);
        broker.placeOrders();
    }
}
