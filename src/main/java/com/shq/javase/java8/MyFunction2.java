package com.shq.javase.java8;

/**
 * 定义一个带泛型的函数式接口，T参数，R返回值
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface MyFunction2<T,R> {
    R getValue(T t1, T t2);
}
