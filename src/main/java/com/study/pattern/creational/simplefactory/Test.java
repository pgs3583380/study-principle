package com.study.pattern.creational.simplefactory;

/**
 * @author 潘根山
 * @create 2018-09-10 20:38
 * @since 1.0.0
 */
public class Test {
    //    public static void main(String[] args) {
//        VideoFactory factory = new VideoFactory();
//        BaseVideo video = factory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        BaseVideo video = factory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
