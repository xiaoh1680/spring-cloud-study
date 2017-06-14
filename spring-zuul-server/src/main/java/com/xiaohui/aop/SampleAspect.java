package com.xiaohui.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by 辉 on 2017/3/25.
 */
@Aspect
@Component
public class SampleAspect {
        @Before("execution(* com.xiaohui.aop..*.*(..))")
         public void doBeforeInServiceLayer() {
                  System.out.println("=====================================");
                 System.out.println("Aop: do before in Service layer");
                 System.out.println("=====================================");
          }

}
