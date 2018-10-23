package com.study.pattern.creational.simplefactory;

/**
 * @author 潘根山
 * @create 2018-09-10 20:37
 * @since 1.0.0
 */
public class PythonVideo extends BaseVideo {
    @Override
    void produce() {
        System.out.println("录制Python视频");
    }
}