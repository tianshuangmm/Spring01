package com.ts.springsimple.beanannotation.multibean;

import com.sun.org.glassfish.gmbal.AMXMBeanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    //String 是对应注入的ID名 默认类名首字母小写
    private Map<String,BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface beanInterface;


    public void say() {
        if (null != list && 0 != list.size()) {
            System.out.println("list...");
            for (BeanInterface bean : list) {
                System.out.println(bean.getClass().getName()+"-------list");
            }
        } else {
            System.out.println("List<BeanInterface> list is null !!!!!!!!!!");
        }

        System.out.println();

        if (null != map && 0 != map.size()) {
            System.out.println("map...");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "      " + entry.getValue().getClass().getName()+"-------map");
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null !!!!!!!!!!");
        }

        System.out.println();
        if (null != beanInterface) {
            System.out.println(beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null...");
        }


    }

}
