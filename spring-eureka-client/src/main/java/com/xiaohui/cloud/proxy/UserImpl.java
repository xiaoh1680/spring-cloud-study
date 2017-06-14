package com.xiaohui.cloud.proxy;

/**
 * Created by 辉 on 2017/6/3.
 */
public class UserImpl implements User{
    @Override
    public String getUserName() {
        System.out.println("my name is xiaohui");
        return "xiaohui";
    }
}
