package com.xiaohui.aop;

import com.xiaohui.aop.proxy.MyInvocationHandler;
import com.xiaohui.aop.proxy.UserService;
import com.xiaohui.aop.proxy.UserServiceImpl;
import org.junit.Test;

/**
 * Created by 辉 on 2017/3/26.
 */
public class ProxyTest {
    @Test
    public void testProxy() throws Throwable{
        //实例化目标对象
        UserService userService=new UserServiceImpl();

        //实例化Invocation
        MyInvocationHandler invocationHandler=new MyInvocationHandler(userService);

        //根据目标生成代理对象
        UserService proxy=(UserService)invocationHandler.getProxy();

        //调用代理对象方法
        proxy.add();
        proxy.remove();
    }
}
