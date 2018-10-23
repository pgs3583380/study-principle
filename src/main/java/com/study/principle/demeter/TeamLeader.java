package com.study.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 潘根山
 * @create 2018-08-27 20:51
 * @since 1.0.0
 */
public class TeamLeader {

    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("课程数量为：" + courseList.size());
    }
}