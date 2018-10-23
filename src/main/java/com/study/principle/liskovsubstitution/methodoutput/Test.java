package com.study.principle.liskovsubstitution.methodoutput;

/**
 * @author 潘根山
 * @create 2018-09-09 09:54
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}