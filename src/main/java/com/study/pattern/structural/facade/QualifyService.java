package com.study.pattern.structural.facade;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/11/12 12:20
 */
public class QualifyService {
    public boolean isValiable(PointGifts pointGifts) {
        System.out.println(pointGifts + "校验通过");
        return true;
    }
}