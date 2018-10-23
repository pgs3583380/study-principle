package com.study.pattern.creational.singleton;

/**
 * @author 潘根山
 * @create 2018-10-11 21:53
 * @since 1.0.0
 */
public class T implements Runnable {
    @Override
    public void run() {
        //   LazySingleton lazySingleton = LazySingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}