package com.shq.config;

import com.shq.aop.LogAspects;
import com.shq.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP: 【动态代理】
 * 在程序运行期间动态的将某段代码切入到指定方法指定位置进行运行的编程方式；
 *
 * 1、定义一段业务逻辑（MathCalculator）
 * 希望在业务逻辑运行过程中打印日志，包括方法运行之前、方法运行结束、方法出现异常等；
 * 2、定义日志切面类（LogAspects）
 * 切面类中的方法需要动态的感知MathCalculator.div()方法的执行；
 * 通知方法：
 *  前置通知：在目标方法运行之前运行；
 *  后置通知：在目标方法执行后运行；（无论方法正常结束还是异常结束都会执行）
 *  返回通知：在目标方法正常返回后运行；
 *  异常通知：在目标方法出现异常以后运行；
 *  环绕通知：动态代理，手动推进目标方法运行（joinPoint.procced()）
 * 切入点表达式来指定在那个方法切入：public int com.shq.aop.MathCalculator.*(..)
 * 3、将切面类、业务逻辑类(将要被切的目标类)都加入到容器中；
 *  必须告诉容器哪个类为切面类：给切面类增加@Aspect
 * 4、关键！！！@EnableAspectJAutoProxy【开启基于注解的AOP】
 *
 *
 */
@EnableAspectJAutoProxy
@Configuration
public class ConfigOfAOP {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

}
