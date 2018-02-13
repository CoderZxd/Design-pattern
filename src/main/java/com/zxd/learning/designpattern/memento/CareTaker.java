package com.zxd.learning.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.memento
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:05 2018/2/13.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>(10);

     public void add(Memento memento){
         mementoList.add(memento);
     }

     public Memento get(int index){
         return mementoList.get(index);
     }
}
