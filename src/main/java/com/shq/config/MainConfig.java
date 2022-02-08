package com.shq.config;

import com.shq.bean.Person;
import com.shq.bean.PersonFactoryBean;
import com.shq.config.conditionl.LinuxConditionl;
import com.shq.config.conditionl.WindowsConditionl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//配置类==配置文件
@Configuration
@ComponentScan(value = "com.shq")
public class MainConfig {

    //给容器中注册一个bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean
    public Person person(){
        return new Person("lisi",20);
    }

    @Bean
    public PersonFactoryBean personFactoryBean(){
        return new PersonFactoryBean();
    }

    @Bean("linux")
    @Conditional({LinuxConditionl.class})
    public Person person01(){
        return new Person("linux",100);
    }

    @Bean("windows")
    @Conditional({WindowsConditionl.class})
    public Person person02(){
        return new Person("windows",100);
    }
}
