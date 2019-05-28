package com.ts.springsimple.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
/*
* https://www.cnblogs.com/fengli9998/p/7472247.html
* */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Autowired
    @Qualifier("stringStore")
    private Store<String> s1;
    @Resource(name="integerStore")
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }
    @Bean(name = "stringStoreTest")
    public Store SpringBootTest(){
        System.out.println("s1:"+s1.getClass().getName());
        System.out.println("s2:"+s2.getClass().getName());
        return new StringStore();
    }

}
