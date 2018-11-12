package com.study.pattern.structural.facade;

/**
 * @author pangenshan
 * @version 1.0
 * @date 2018/11/12 12:27
 */
public class Test {
    public static void main(String[] args) {
        PointsExchangeService pointsExchangeService = new PointsExchangeService();
        PointGifts gifts = new PointGifts();
        gifts.setName("T恤");
        pointsExchangeService.exchange(gifts);
    }
}
