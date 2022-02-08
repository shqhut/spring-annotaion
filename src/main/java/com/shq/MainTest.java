package com.shq;

import com.shq.bean.Person;
import com.shq.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        //加载类路径下的配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(beanNamesForType).forEach(System.out::println);
    }

}
