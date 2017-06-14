package com.xiaohui.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 辉 on 2017/3/25.
 */
@Service
public class AopConfigTest {
    public void getName() {
        System.out.println("1111111111");
    }

    public void setName() {
        System.out.println("222222");
    }
}
