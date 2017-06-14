package com.xiaohui.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 辉 on 2017/3/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Aoptest {
    @Autowired
    private AopConfigTest aopConfigTest;

    @Test
    public void aoptest() {
        aopConfigTest.getName();
    }

    public static void main(String[] args) {
        String s;
        System.out.println("xiaohui".hashCode());
        System.out.println("xiaohui".hashCode());
        System.out.println("xiaohui1".hashCode());
    }
}
