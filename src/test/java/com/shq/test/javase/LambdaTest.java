package com.shq.test.javase;

import com.shq.javase.java8.MyFunction;
import com.shq.javase.java8.MyFunction2;
import org.junit.Test;

public class LambdaTest {

    @Test
    public void testMyFunction(){
        String str = "shq";
        String handlerStr = handlerStr(str, String::toUpperCase);
        System.out.println(str); // shq
        System.out.println(handlerStr); // SHQ

        Long handlereLong = handlereLong(1L, 2L, Long::sum);
        System.out.println(handlereLong);
    }

    public String handlerStr(String str, MyFunction myFunction){
        return myFunction.getValue(str);
    }

    public Long handlereLong(Long a, Long b, MyFunction2<Long,Long> myFunction2){
        return myFunction2.getValue(a,b);
    }


}
