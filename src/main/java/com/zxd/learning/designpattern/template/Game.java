package com.zxd.learning.designpattern.template;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.template
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:33 2018/2/13.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
