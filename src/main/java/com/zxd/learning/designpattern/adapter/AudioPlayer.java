package com.zxd.learning.designpattern.adapter;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.adapter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 14:00 2018/2/12.
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType) ){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
