package com.zxd.learning.designpattern.template;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.template
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:36 2018/2/13.
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
