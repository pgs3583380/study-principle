package com.study.pattern.creational.abstractfactory;

/**
 * @author 潘根山
 * @create 2018-09-18 21:01
 * @since 1.0.0
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();
}
