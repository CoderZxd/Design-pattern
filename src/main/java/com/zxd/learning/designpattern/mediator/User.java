package com.zxd.learning.designpattern.mediator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.mediator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:42 2018/2/13.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
