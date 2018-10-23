package com.study.pattern.creational.abstractfactory;

/**
 * @author 潘根山
 * @create 2018-09-18 21:03
 * @since 1.0.0
 */
public class JavaArticle extends Article {
    @Override
    void produce() {
        System.out.println("编写Java手记");
    }
}