package com.study.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * @author 潘根山
 * @create 2018-09-09 09:34
 * @since 1.0.0
 */
public class Base {
    public void method(Map hashMap) {
        System.out.println("执行父类method方法");
    }
}