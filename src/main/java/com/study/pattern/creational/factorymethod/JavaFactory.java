package com.study.pattern.creational.factorymethod;

/**
 * @author 潘根山
 * @create 2018-09-18 19:29
 * @since 1.0.0
 */
public class JavaFactory extends VideoFactory {
    @Override
    BaseVideo getVideo() {
        return new JavaVideo();
    }
}