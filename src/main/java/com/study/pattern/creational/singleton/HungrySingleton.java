package com.study.pattern.creational.singleton;

/**
 * @author 潘根山
 * @create 2018-10-22 06:43
 * @since 1.0.0
 */
public class HungrySingleton {
    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}