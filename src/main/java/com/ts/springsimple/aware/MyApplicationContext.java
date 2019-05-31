package com.ts.springsimple.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/*
*ApplicationContextAware
* 看到—Aware就知道是干什么的了，就是属性注入的，
* 但是这个ApplicationContextAware的不同地方在于，实现了这个接口的bean，
* 当spring容器初始化的时候，会自动的将ApplicationContext注入进来：
*https://blog.csdn.net/weixin_41558061/article/details/80839131
* */
public class MyApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("MyApplicationContext : "+this.applicationContext.hashCode());
    }
}
