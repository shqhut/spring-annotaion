package com.shq.test;

import com.shq.config.ConfigOfEx;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExTest {

    /**
     * Spring提供的基于事件驱动开发的功能
     * 监听器通过监听事件来触发监听器的回调
     * ApplicationListener<E extends ApplicationEvent>
     *     ApplicationEvent 监听ApplicationEvent的子类及其子事件
     *
     * 1）、写一个监听器来监听某个事件
     * 2）、把监听器加入容器
     * 3）、只要容器中有相关事件发布，我门就能监听到这个是事件
     * ContextRefreshedEvent：容器刷新完成（所有bean都完成创建）会发布该事件
     */
    @Test
    public void testApplicationListener(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigOfEx.class);
        applicationContext.close();
    }

}
