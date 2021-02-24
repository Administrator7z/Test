package com.xxx.s01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before(value = "execution(public void com.xxx.s01.SomeServiceImpl.doSome(String,int))")
    public void MyAspect() {
        System.out.println("前置功能");
    }
//  @AfterReturning(value = "execution(* com.xxx.s01.SomeServiceImpl.*(..))",returning = "object")
    @AfterReturning(value = "execution(* com.xxx.s01.SomeServiceImpl.doFirst(..))",returning = "object")
    public void MyAspect2(Object object) {
        String  returnRest = "";
        if(object != null){
            returnRest = (String)object;
        }
        System.out.println("后置通知"+returnRest);
    }
    @Around(value = "execution(* com.xxx.s01.SomeServiceImpl.doAround(..))")
    public Object MyAspect3(ProceedingJoinPoint pj) throws Throwable {
//        System.out.println("前增强");
//        String proceed = (String) pj.proceed();
//        pj.getArgs();
//        System.out.println("后增强");
//        return null;
        Object[] args = pj.getArgs();
        if(args !=null && args.length>1){
            String name = (String) args[0];
            if ("张三".equals(name)){
                System.out.println("前置");
                String proceed = (String) pj.proceed();
                System.out.println("后置"+proceed);
                return proceed;
            }
            else {
                return "不增强";
            }


        }
        return null;

    }

}
