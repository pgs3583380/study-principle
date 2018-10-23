package com.study.pattern.creational.singleton;

/**
 * @author 潘根山
 * @create 2018-10-11 21:52
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program end");
    }
}