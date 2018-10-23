package com.study.pattern.creational.builder;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author 潘根山
 * @create 2018-10-09 21:32
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach(courseBuilder);
        Course course = coach.makeCourse("JAVA设计模式精讲",
                "JAVA设计模式精讲PPT",
                "JAVA设计模式精讲Article",
                "JAVA设计模式精讲Video",
                "JAVA设计模式精讲QA");
        System.out.println(course);
        Set<String> set = ImmutableSet.<String>builder().add("1234").add("888").build();
        System.out.println(set);
    }
}