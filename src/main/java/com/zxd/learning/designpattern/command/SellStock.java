package com.zxd.learning.designpattern.command;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.command
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:39 2018/2/13.
 */
public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
