package com.zxd.learning.designpattern.mediator;

import java.util.Date;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.mediator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:42 2018/2/13.
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
