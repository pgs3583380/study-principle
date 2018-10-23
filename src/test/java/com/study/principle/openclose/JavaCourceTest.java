package com.study.principle.openclose;

import org.junit.Test;

/**
 * @author 潘根山
 * @create 2018-08-24 06:57
 * @since 1.0.0
 */
public class JavaCourceTest {

    @Test
    public void getId() {
        ICourse iCourse = new JavaDiscountCource(1, "JVM性能调优", 199d);
        JavaDiscountCource javaCource = (JavaDiscountCource) iCourse;
        System.out.println("该课程id:" + javaCource.getId() + ",该课程名称:" + javaCource.getName() + ",该课程价格:" + javaCource.getPrice() + ",该课程折后价格：" + javaCource.getDiscountPrice());
    }
}