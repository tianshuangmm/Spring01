package com.ts.springsimple.bean;

import com.ts.springsimple.AbstractUnitTestSupport;
import javafx.application.Application;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanScopeTest extends AbstractUnitTestSupport {
    public BeanScopeTest() {
        super("classpath:spring-beanscope.xml");
    }

    @Test
    public void singletonTest(){
        BeanScope beanScopeForSingleton1 = getBean("BeanScopeForSingleton");
        beanScopeForSingleton1.say();
        BeanScope beanScopeForSingleton2 = getBean("BeanScopeForSingleton");
        beanScopeForSingleton2.say();
    }

    @Test
    public void prototypeTest(){
        BeanScope beanScopeForPrototype1 = getBean("BeanScopeForPrototype");
        beanScopeForPrototype1.say();
        BeanScope beanScopeForPrototype2 = getBean("BeanScopeForPrototype");
        beanScopeForPrototype2.say();
    }
}