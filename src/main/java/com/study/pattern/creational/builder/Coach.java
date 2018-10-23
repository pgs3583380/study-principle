package com.study.pattern.creational.builder;

/**
 * @author 潘根山
 * @create 2018-10-09 21:29
 * @since 1.0.0
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public Coach(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseArticle,
                             String courseVideo,
                             String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}