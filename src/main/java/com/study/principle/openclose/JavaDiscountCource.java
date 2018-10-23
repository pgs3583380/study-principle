package com.study.principle.openclose;

/**
 * @author 潘根山
 * @create 2018-08-24 07:01
 * @since 1.0.0
 */
public class JavaDiscountCource extends JavaCource {

    public JavaDiscountCource(int id, String name, double price) {
        super(id, name, price);
    }

    public double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}