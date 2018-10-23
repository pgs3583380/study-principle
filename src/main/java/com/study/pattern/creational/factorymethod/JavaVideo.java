package com.study.pattern.creational.factorymethod;

/**
 * @author 潘根山
 * @create 2018-09-10 20:37
 * @since 1.0.0
 */
public class JavaVideo extends BaseVideo {
    @Override
    void produce() {
        System.out.println("录制java视频");
    }
}