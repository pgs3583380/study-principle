package com.study.pattern.structural.facade;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/11/12 12:22
 */
public class PointsPaymentService {
    public boolean pay(PointGifts pointGifts) {
        System.out.println(pointGifts + "积分扣减成功");
        return true;
    }
}