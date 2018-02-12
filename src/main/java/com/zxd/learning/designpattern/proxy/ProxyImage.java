package com.zxd.learning.designpattern.proxy;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.proxy
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 18:10 2018/2/12.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
