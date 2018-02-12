package com.zxd.learning.designpattern.adapter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.adapter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 13:56 2018/2/12.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
