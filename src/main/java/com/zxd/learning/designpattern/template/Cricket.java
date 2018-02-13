package com.zxd.learning.designpattern.template;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.template
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:35 2018/2/13.
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
