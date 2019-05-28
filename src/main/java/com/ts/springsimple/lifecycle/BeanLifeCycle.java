package com.ts.springsimple.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycle implements InitializingBean,DisposableBean {

     //这里的注解起作用要有包扫描
     @PostConstruct
     public void defaultInit(){
         System.out.println("bean defaultInit");
     }

     @PreDestroy
     public void defaultDestroy(){
         System.out.println("bean defaultDestroy");
     }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterProperties");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");

    }

    public void start(){
        System.out.println("bean start...");
    }

    public void stop(){
        System.out.println("bean stop..");
    }
}
