package com.study.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author 潘根山
 * @create 2018-09-09 09:38
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap=new HashMap();
        child.method(hashMap);
    }
}
