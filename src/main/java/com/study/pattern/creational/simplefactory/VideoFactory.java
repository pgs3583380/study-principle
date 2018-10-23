package com.study.pattern.creational.simplefactory;

/**
 * @author 潘根山
 * @create 2018-09-10 20:39
 * @since 1.0.0
 */
public class VideoFactory {
    //    public BaseVideo getVideo(String video) {
//        if ("java".equals(video)) {
//            return new JavaVideo();
//        } else if ("python".equals(video)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
    public BaseVideo getVideo(Class clzz) {
        BaseVideo video = null;
        try {
            video = (BaseVideo) Class.forName(clzz.getName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }
}