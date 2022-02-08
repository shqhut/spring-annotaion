package com.shq.test;

import com.shq.service.UserService;
import com.shq.tx.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {

    @Test
    public void testTx(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }

}
