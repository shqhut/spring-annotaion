package com.shq.test;

import com.shq.bean.Person;
import com.shq.config.MainConfig;
import com.shq.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取容器中所有定义的名字
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

    }

    /**
     * 测试使用FactoryBean创建Bean
     */
    @Test
    public void testFactoryBean(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //personFactoryBean获取的是调用getObject方法创建的对象
        Object personFactoryBean = applicationContext.getBean("personFactoryBean");
        System.out.println("personFactoryBean的类型："+personFactoryBean.getClass());
    }


    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        //获取容器中所有定义的名字
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        //根据id从容器中获取Bean，这个Bean默认是单实例的
        Person person = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    public void testScope(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("IoC容器创建完成.....");
        Person person = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");
    }

    @Test
    public void testAware(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
    }

    @Test
    public void testConditionl(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println(bean);
        }
    }


}
