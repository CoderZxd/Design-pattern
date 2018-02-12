package com.zxd.learning.designpattern.prototype;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.prototype
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:18 2018/2/12.
 */
public abstract class Shape implements Cloneable{

    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException  e){
            e.printStackTrace();
        }
        return object;
    }
}
