package com.ts.springsimple.beanannotation;

import com.ts.springsimple.AbstractUnitTestSupport;
import com.ts.springsimple.beanannotation.javabased.Store;
import com.ts.springsimple.beanannotation.multibean.BeanInvoker;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanAnnotationTest extends AbstractUnitTestSupport {

    public BeanAnnotationTest() {
        super("spring-beanAnnotation.xml");
    }
    /*
    * 测试获取bean的两种方式
    *    方式：getBean 通过ID或者.class方式
    * */
    @Test
    public void createBean(){
        BeanAnnotation bean = getBean(BeanAnnotation.class);
        bean.say("你好！");
        bean = super.getBean("beanAnnotation");
        bean.say("你好！");
    }
    /*
    * 同上
    * */
    @Test
    public void createBean2(){
        BeanAnnotation bean = getBean(BeanAnnotation.class);
        bean.myHashCode();
        bean = super.getBean("beanAnnotation");
        bean.myHashCode();
    }
    /*
    *测试 javabased包下的注解
    * */
    @Test
    public void createBean3(){
        Store bean = getBean("stringStoreTest");
        System.out.println(bean.getClass().getName());
    }


    /*
     *测试 multibean包下的注解
     * */
    @Test
    public void createBean4(){
        BeanInvoker bean = getBean(BeanInvoker.class);
        bean.say();
    }
}