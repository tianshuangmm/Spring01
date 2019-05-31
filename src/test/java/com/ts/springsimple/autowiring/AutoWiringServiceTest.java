package com.ts.springsimple.autowiring;

import com.ts.springsimple.AbstractUnitTestSupport;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoWiringServiceTest extends AbstractUnitTestSupport {

    public AutoWiringServiceTest() {
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void say(){
        AutoWiringService autoWiringService = getBean("autoWiringService");
        autoWiringService.say("开始运行了！");
    }
}