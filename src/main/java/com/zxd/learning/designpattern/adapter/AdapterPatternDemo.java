package com.zxd.learning.designpattern.adapter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.adapter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:04 2018/2/12.
 */
public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
