package com.ts.springsimple.ioc.service;
import com.ts.springsimple.ioc.dao.injectionDAO;
import com.ts.springsimple.ioc.dao.injectionDAOImpl;

public class injectionServiceImpl implements injectionService{

    private injectionDAOImpl injectionDAO;

    public injectionServiceImpl(injectionDAOImpl injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String str) {
        System.out.println("业务层操作dao层......."+str );
        injectionDAO.save("业务层传递数据");
    }


    public void setInjectionDAO(injectionDAOImpl injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
