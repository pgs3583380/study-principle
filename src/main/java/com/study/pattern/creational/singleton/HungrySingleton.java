package com.study.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author 潘根山
 * @create 2018-10-22 06:43
 * @since 1.0.0
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}