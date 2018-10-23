package com.study.principle.dependenceinversion;

/**
 * @author 潘根山
 * @create 2018-08-27 19:27
 * @since 1.0.0
 */
public class Test {
    //v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCouse();
//        geely.studyPHPCourse();
//    }

    //    //V2
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new PHPCourse());
//    }
    //V3
//    public static void main(String[] args) {
//        Geely geely = new Geely(new PHPCourse());
//        Geely geely2=new Geely(new JavaCourse());
//    }
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();
    }
}