package com.study.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 潘根山
 * @create 2018-09-09 09:52
 * @since 1.0.0
 */
public class Child extends Base {
    @Override
    public Map method() {
        System.out.println("子类方法被调用");
        Map<String, Object> map = new HashMap<>(1);
        map.put("message", "子类方法被调用");
        return map;
    }
}