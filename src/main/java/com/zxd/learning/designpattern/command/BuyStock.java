package com.zxd.learning.designpattern.command;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.command
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:38 2018/2/13.
 */
public class BuyStock implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
