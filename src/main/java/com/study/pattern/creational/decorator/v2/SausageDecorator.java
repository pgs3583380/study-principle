package com.study.pattern.creational.decorator.v2;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/12/4 15:42
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}