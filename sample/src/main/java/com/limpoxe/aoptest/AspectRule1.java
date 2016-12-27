package com.limpoxe.aoptest;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by cailiming on 16/12/27.
 */

@Aspect
public class AspectRule1 {

    @Pointcut("execution(* com.limpoxe.aoptest.MainActivity.doSomething(..))")
    public void point(){}

    @Before(value="point()")
    public void pointBefore(){
        System.out.println("【pointBefore】...");
    }

    @AfterReturning("point()")
    public void pointAfter(){
        System.out.println("【pointAfter】...");
    }

}
