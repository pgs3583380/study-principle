package com.study.pattern.structural.facade;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/11/12 12:23
 */
public class ShippingService {
    public String shipping(PointGifts pointGifts) {
        System.out.println(pointGifts.getName() + "下单成功");
        String orderNo = "666";
        return orderNo;
    }
}