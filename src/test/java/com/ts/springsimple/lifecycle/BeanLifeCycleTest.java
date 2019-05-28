package com.ts.springsimple.lifecycle;

import com.ts.springsimple.AbstractUnitTestSupport;
import org.junit.Test;

import static org.junit.Assert.*;
/*
* 测试bean的生命周期
* 在spring初始化bean和销毁前所做的操作定义方式有三种
* 1、第一种：通过@PostConstruct 和 @PreDestroy 方法 实现初始化和销毁bean之前进行的操作
* 2、第二种：通过在xml中定义init-method 和 destroy-method方法
* 3、第三种：通过InitializingBean 和 disposableBean接口

  https://blog.csdn.net/topwqp/article/details/8681467

* */
public class BeanLifeCycleTest extends AbstractUnitTestSupport {

    public BeanLifeCycleTest() {
        super("classpath:spring-beanLifeCycle.xml");
    }

    @Test
    public void beanLife(){
        BeanLifeCycle bean = getBean(BeanLifeCycle.class);
    }
}