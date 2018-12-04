package com.study.pattern.creational.decorator.v2;

/**
 * 实际的煎饼类
 *
 * @author pangenshan
 * @version 1.0
 * @date 2018/12/4 15:38
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}