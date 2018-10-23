package com.study.pattern.creational.abstractfactory;

/**
 * @author 潘根山
 * @create 2018-09-18 21:06
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourceFactory();
        Article article = factory.getArticle();
        Video video = factory.getVideo();
        article.produce();
        video.produce();
    }
}