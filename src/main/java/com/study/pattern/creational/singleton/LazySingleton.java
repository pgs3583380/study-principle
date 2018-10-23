package com.study.pattern.creational.singleton;

/**
 * @author 潘根山
 * @create 2018-10-11 21:50
 * @since 1.0.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}