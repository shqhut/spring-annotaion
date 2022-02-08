package com.shq.config;

import com.shq.bean.Person;
import org.springframework.context.annotation.*;

@ComponentScan(value = "com.shq")
@Configuration
@EnableAspectJAutoProxy
public class MainConfig2 {


    /**
     * ConfigurableBeanFactory.SCOPE_PROTOTYPE, singleton
     * ConfigurableBeanFactory.SCOPE_SINGLETON, prototype
     * org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST, request
     * org.springframework.web.context.WebApplicationContext.SCOPE_SESSION, session
     *
     *
     * singleton:单实例的（默认） IoC容器启动时就会调用方法创建对象放到IoC容器中；
     *                           以后每次获取都是从IoC容器中拿，获取到的都是同一个对象；
     * prototype:多实例的 IoC容器启动并不会调用方法去创建对象放到容器中，每次从容器中取的时候才会调用方法创建对象；
     * request:同一次请求创建一个实例
     * session:同一个Session创建一个实例
     */
    @Scope(value = "prototype")
    @Bean
    public Person person(){
        System.out.println("给容器添加person....执行");
        return new Person("库里",33);
    }
}
