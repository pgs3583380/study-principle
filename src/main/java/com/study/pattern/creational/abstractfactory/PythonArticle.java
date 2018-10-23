package com.study.pattern.creational.abstractfactory;

/**
 * @author 潘根山
 * @create 2018-09-18 21:03
 * @since 1.0.0
 */
public class PythonArticle extends Article {
    @Override
    void produce() {
        System.out.println("编写Python手记");
    }
}