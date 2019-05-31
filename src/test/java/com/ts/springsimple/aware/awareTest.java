package com.ts.springsimple.aware;

import com.ts.springsimple.AbstractUnitTestSupport;
import org.junit.Test;

import static org.junit.Assert.*;

public class awareTest extends AbstractUnitTestSupport {
    public awareTest() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void demo() {
       // MyApplicationContext myApplicationContext = getBean("myApplicationContext");

    }
}