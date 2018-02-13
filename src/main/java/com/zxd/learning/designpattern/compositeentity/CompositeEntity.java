package com.zxd.learning.designpattern.compositeentity;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.compositeentity
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 16:49 2018/2/13.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
