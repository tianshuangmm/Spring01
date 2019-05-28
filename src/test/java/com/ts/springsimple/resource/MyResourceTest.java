package com.ts.springsimple.resource;

import com.ts.springsimple.AbstractUnitTestSupport;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

public class MyResourceTest extends AbstractUnitTestSupport {
    public MyResourceTest() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void getResource(){
        MyResource myResource = getBean("MyResource");
        try {
            myResource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}