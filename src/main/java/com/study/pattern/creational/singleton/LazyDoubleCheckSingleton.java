package com.study.pattern.creational.singleton;

/**
 * @author 潘根山
 * @create 2018-10-11 21:50
 * @since 1.0.0
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //要注意指令重排
                //1.分配内存
                //2.生成对象
                //3.lazySingleton指向对象
                //2、3 可能会发生指令重排的情况
                lazySingleton = new LazyDoubleCheckSingleton();
            }
        }
        return lazySingleton;
    }
}