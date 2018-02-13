package com.zxd.learning.designpattern.template;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.template
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:36 2018/2/13.
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
