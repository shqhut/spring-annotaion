package com.shq.test;

import com.shq.aop.MathCalculator;
import com.shq.config.ConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    @Test
    public void testAOP(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigOfAOP.class);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,1);
        applicationContext.close();
    }

}
