package com.study.pattern.creational.singleton;

/**
 * 单例设计模式-静态内部类
 * 基于类初始化的延迟加载方案
 *
 * @author 潘根山
 * @create 2018-10-22 06:31
 * @since 1.0.0
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {

    }
}