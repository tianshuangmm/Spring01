package com.ts.springsimple.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
* @scope默认是单例模式（singleton）
如果需要设置的话@scope("prototype")

1.singleton单例模式,
  全局有且仅有一个实例

2.prototype原型模式，
　每次获取Bean的时候会有一个新的实例

3.request
  request表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效，配置实例：
  request、session、global session使用的时候首先要在初始化web的web.xml中做如下配置：
  如果你使用的是Servlet 2.4及以上的web容器，那么你仅需要在web应用的XML声明文件web.xml中增加下述ContextListener即可： 

4.session
　　session作用域表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP session内有效

5.global session
   global session作用域类似于标准的HTTP Session作用域，不过它仅仅在基于portlet的web应用中才有意义。
   Portlet规范定义了全局Session的概念，它被所有构成某个 portlet web应用的各种不同的portlet所共享。
   在global session作用域中定义的bean被限定于全局portlet Session的生命周期范围内。
   如果你在web中使用global session作用域来标识bean，那么web会自动当成session类型来使用。

链接：https://blog.csdn.net/cuichunchi/article/details/79170240
* */
@Scope      //@Scope    默认是单例
@Component  //@Component默认id为 beanAnnotation
public class BeanAnnotation {

    public void say(String arg){
        System.out.println("BeanAnnotation :"+arg);
    }

    public void myHashCode(){
        System.out.println("BeanAnnotation :"+this.hashCode());
    }
}
