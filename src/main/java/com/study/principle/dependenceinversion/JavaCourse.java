package com.study.principle.dependenceinversion;

/**
 * @author 潘根山
 * @create 2018-08-27 19:30
 * @since 1.0.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习JAVA");
    }
}
