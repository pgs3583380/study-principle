package com.study.principle.liskovsubstitution;

/**
 * @author 潘根山
 * @create 2018-09-09 08:50
 * @since 1.0.0
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
//    public static void main(String[] args) {
//        Square square = new Square();
//        square.setWidth(10);
//        resize(square);
//    }
}