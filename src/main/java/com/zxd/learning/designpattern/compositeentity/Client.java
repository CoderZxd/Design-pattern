package com.zxd.learning.designpattern.compositeentity;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.compositeentity
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:50 2018/2/13.
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }
    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
