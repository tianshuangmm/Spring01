package com.ts.springsimple.ioc.dao;

import org.springframework.stereotype.Repository;


public class injectionDAOImpl implements injectionDAO {
    @Override
    public void save(String str) {
        //模拟数据库保存操作
        System.out.println(str+":已经保存到了数据库！"+str);
    }
}
