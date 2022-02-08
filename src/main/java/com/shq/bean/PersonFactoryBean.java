package com.shq.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 使用Spring提供的FactoryBean（工厂Bean）
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    //返回一个Person对象，会被添加到容器中
    //调用getObject()方法创建Bean
    @Override
    public Person getObject() throws Exception {
        System.out.println("PersonFactoryBean....getObject....");
        return new Person("PersonFactoryBean创建",100);
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    //控制是否单例
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
