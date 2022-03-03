package com.shq.bean;

import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean {

    public Car(){
        System.out.println("car constructor....");
    }

    public void init(){
        System.out.println("car init....");
    }

    public void destory(){
        System.out.println("car destory....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean...afterPropertiesSet...");
    }
}
