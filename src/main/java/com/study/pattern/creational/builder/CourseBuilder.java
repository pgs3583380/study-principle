package com.study.pattern.creational.builder;

/**
 * @author 潘根山
 * @create 2018-10-09 21:20
 * @since 1.0.0
 */
public interface CourseBuilder {
    void buildCourseName(String courseName);

    void buildCoursePPT(String coursePPT);

    void buildCourseArticle(String courseArticle);

    void buildCourseVideo(String courseVideo);

    void buildCourseQA(String courseQA);

    Course makeCourse();
}