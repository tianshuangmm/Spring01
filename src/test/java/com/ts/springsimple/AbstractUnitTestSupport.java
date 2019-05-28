package com.ts.springsimple;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.beans.Beans;

/*
 * 支持单元测试抽象基类
 * */
public class AbstractUnitTestSupport {
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;
    private String SpringXmlPath;

    public AbstractUnitTestSupport() {
    }

    public AbstractUnitTestSupport(String springXmlPath) {
        this.SpringXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        if(StringUtils.isEmpty(SpringXmlPath)){
            this.SpringXmlPath = "classpath*:spring-*";
        }
        try{
            classPathXmlApplicationContext = new ClassPathXmlApplicationContext(SpringXmlPath);
            classPathXmlApplicationContext.start();
        }catch (BeansException e){
            e.printStackTrace();
        }

    }

    @After
    public void after(){
        classPathXmlApplicationContext.destroy();
    }

    protected <T extends Object> T getBean(String beanId){
        try{
            return (T)classPathXmlApplicationContext.getBean(beanId);
        }catch (BeansException e){
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz){
        try{
            return (T)classPathXmlApplicationContext.getBean(clazz);
        }catch (BeansException e){
            e.printStackTrace();
            return null;
        }
    }
}
