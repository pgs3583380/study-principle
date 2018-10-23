package com.study.principle.dependenceinversion;

/**
 * 依赖倒置
 *
 * @author 潘根山
 * @create 2018-08-27 19:21
 * @since 1.0.0
 */
public class Geely {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}