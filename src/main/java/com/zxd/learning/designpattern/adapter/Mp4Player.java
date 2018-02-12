package com.zxd.learning.designpattern.adapter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.adapter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 13:54 2018/2/12.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //TO DO NOTHING
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
