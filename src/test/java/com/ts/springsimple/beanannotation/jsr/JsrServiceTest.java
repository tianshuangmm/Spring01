package com.ts.springsimple.beanannotation.jsr;

import com.ts.springsimple.AbstractUnitTestSupport;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsrServiceTest extends AbstractUnitTestSupport {

    public JsrServiceTest() {
        super("classpath:spring-beanAnnotation.xml");
    }

    @Test
    public void save(){
        JsrService bean = getBean(JsrService.class);
        bean.save();
    }
}