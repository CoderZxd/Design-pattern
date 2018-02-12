package com.zxd.learning.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:28 2018/2/12.
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>(10);

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item:items){
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing());
            System.out.println(",Price:"+item.price());
        }
    }

}
