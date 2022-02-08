package com.shq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 日志切面类
 * @Aspect 告诉Spring容器这是一个切面类
 *
 */
@Aspect
public class LogAspects {

    /**
     * 抽取公用的切入点表达式
     */
    @Pointcut("execution(public int com.shq.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("" + joinPoint.getSignature().getName() +"运行。。。@Before参数列表是：{"+ Arrays.asList(args) +"}");
    }

    @After("execution(public int com.shq.aop.MathCalculator.*(..))")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("" + joinPoint.getSignature().getName() +"结束@After");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("" + joinPoint.getSignature().getName() +"结果正常返回。。。@AfterReturning运行结果是：{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        System.out.println("" + joinPoint.getSignature().getName() +"异常。。。@AfterThrowing异常信息是：{"+ exception.getMessage() +"}");
    }
}
