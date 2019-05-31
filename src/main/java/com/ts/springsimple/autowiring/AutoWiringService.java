package com.ts.springsimple.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
        System.out.println("AutoWiringService");
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
        System.out.println("setAutoWiringDAO");
    }

    public void say(String str){
        autoWiringDAO.say(str);
    }
}
