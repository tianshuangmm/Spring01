package com.ts.springsimple.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/*
* 实现BeanNameAware接口需要实现setBeanName()方法，
* 这个方法只是简单的返回我们当前的beanName
* */
public class MyBeanName implements BeanNameAware , ApplicationContextAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        beanName = s;
        System.out.println("MyBeanName : "+s);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext : "+applicationContext.hashCode());
    }
}
