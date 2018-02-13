package com.zxd.learning.designpattern.frontcontroller;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.frontcontroller
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 17:02 2018/2/13.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
