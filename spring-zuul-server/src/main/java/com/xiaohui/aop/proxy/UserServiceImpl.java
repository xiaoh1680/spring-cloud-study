package com.xiaohui.aop.proxy;

/**
 * Created by 辉 on 2017/3/26.
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("----------add----------");
    }

    @Override
    public void remove() {
        System.out.println("----------remove----------");
    }
}
