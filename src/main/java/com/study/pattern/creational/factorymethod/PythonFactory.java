package com.study.pattern.creational.factorymethod;

/**
 * @author 潘根山
 * @create 2018-09-18 19:30
 * @since 1.0.0
 */
public class PythonFactory extends VideoFactory {
    @Override
    BaseVideo getVideo() {
        return new PythonVideo();
    }
}
