package com.study.pattern.creational.builder.v2;

/**
 * @author 潘根山
 * @create 2018-10-09 21:51
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("JAVA设计模式精讲").buildCourseArticle("JAVA设计模式精讲手记").build();
        System.out.println(course);
    }
}