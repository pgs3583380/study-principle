package com.study.pattern.creational.decorator.v2;

/**
 * 抽象的装饰类
 *
 * @author pangenshan
 * @version 1.0
 * @date 2018/12/4 15:39
 */
public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    /**
     * 在需要做一些特定的操作的时候，可以将其置成抽象类，强制子类继承实现
     */
    public abstract void doSomething();

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}