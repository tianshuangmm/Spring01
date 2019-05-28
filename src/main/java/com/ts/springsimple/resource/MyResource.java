package com.ts.springsimple.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;
/*
* 在服务器启动过程中，spring容器也会初始化，那么当然，
* Spring的ApplicationContext对象肯定也在这个过程中会被初始化了
*
* */
public class MyResource implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
        Resource resource = applicationContext.getResource("classpath:config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
