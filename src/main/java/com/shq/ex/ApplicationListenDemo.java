package com.shq.ex;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListenDemo implements ApplicationListener<ApplicationEvent> {

    /**
     * 当容器发布此事件以后，方法触发
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("监听到的事件：" + event);
    }
}
