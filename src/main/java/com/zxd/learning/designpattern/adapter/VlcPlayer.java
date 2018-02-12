package com.zxd.learning.designpattern.adapter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.adapter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 13:54 2018/2/12.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //TO DO NOTHING
    }
}
