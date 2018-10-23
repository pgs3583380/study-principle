package com.study.pattern.creational.abstractfactory;

/**
 * @author 潘根山
 * @create 2018-09-18 21:03
 * @since 1.0.0
 */
public class PythonVideo extends Video {
    @Override
    void produce() {
        System.out.println("录制Python视频");
    }
}