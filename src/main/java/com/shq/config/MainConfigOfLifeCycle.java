package com.shq.config;

import com.shq.bean.Car;
import com.shq.bean.Person;
import com.shq.postProcesser.MyPostProcesser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * bean的生命周期：
 *  bean创建---初始化---销毁的过程
 * 容器管理bean的生命周期；
 *
 * 构造（对象创建）
 *  单实例：在容器启动的时候创建对象；
 *  多实例：在每次获取的时候创建对象；
 *  BeanPostProcessor---postProcessBeforeInitialization()
 * 初始化：
 *  对象创建完成，并赋值好，调用初始化方法init-method；
 *  BeanPostProcessor---postProcessAfterInitialization()
 * 销毁：
 *  单实例：容器关闭的时候；
 *  多实例：容器不会管理这个bean；容器不会调用销毁方法；
 *
 *
 * 我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法；
 *  1、在配置文件中或@Bean注解指定init-method和destroy-method；
 *  2、InitializingBean：让bean实现InitializingBean在afterPropertiesSet()中定义初始化逻辑；
 *     DisposableBean：让bean实现DisposableBean在destroy()中定义销毁逻辑；
 *  3、BeanPostProcessor：bean的后置处理器方法；
 *     在bean初始化前后进行一些处理工作；
 *     postProcessBeforeInitialization() ---在初始化前进行后置处理
 *     postProcessAfterInitialization() ---在初始化后进行后置处理
 *
 *
 *
 */
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

    @Bean
    public MyPostProcesser myPostProcesser(){
        return new MyPostProcesser();
    }

    @Bean
    public Person person(){
        return new Person();
    }
}
