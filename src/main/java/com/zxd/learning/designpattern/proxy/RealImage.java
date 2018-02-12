package com.zxd.learning.designpattern.proxy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.proxy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 18:09 2018/2/12.
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
