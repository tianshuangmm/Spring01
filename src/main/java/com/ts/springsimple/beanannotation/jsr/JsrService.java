package com.ts.springsimple.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
/*
*https://segmentfault.com/a/1190000010940424
* 本文介绍的两个注解，是JSR-330的一部分。
*   在Spring 3中，开始支持JSR-330的注解。
*   这些注解在使用上和Spring的注解一样，所不同的只是需要额外的相关jar包。
*   你可以使用下面的注解在spring 3应用中。
- @Inject替代@Autowired来执行注入
- @Named替代@Component来声明一个Bean
*
* */
@Named
public class JsrService {
    /**
     * 两种方法：成员变量，set方法
     *两种方法 默认的bean id为：类首字母小写
     *
     */
    @Inject
    private JsrDAO jsrDAO;

    /*@Inject
    //若有JsrDao为接口的两个实现类同时注入到同一个IOC容器中指定哪一个具体的实现类注入
    public JsrService(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }*/

    @PostConstruct
    public void init(){
        System.out.println("Jsr Service init..........");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Jsr service destroy.........");
    }

    public void save(){
        jsrDAO.save();
    }
}
