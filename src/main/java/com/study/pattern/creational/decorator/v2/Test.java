package com.study.pattern.creational.decorator.v2;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/12/4 15:43
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 价格:" + aBattercake.cost());
    }
}