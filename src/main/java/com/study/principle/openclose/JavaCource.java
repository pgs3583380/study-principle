package com.study.principle.openclose;

/**
 * @author 潘根山
 * @create 2018-08-24 06:55
 * @since 1.0.0
 */
public class JavaCource implements ICourse {
    private int id;

    private String name;

    private double price;

    public JavaCource(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}