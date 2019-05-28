package com.ts.springsimple.ioc.service;

import com.ts.springsimple.AbstractUnitTestSupport;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class injectionServiceImplTest extends AbstractUnitTestSupport {

    public injectionServiceImplTest() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSave(){
        injectionService bean = getBean(injectionService.class);
        bean.save("----保存操作执行了----");
    }
}