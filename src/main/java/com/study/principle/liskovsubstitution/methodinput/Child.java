package com.study.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author 潘根山
 * @create 2018-09-09 09:36
 * @since 1.0.0
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap hashMap) {
//        System.out.println("重写父类method方法");
//    }

    public void method(HashMap map) {
        System.out.println("重载父类method 方法");
    }
}