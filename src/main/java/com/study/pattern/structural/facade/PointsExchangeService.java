package com.study.pattern.structural.facade;

/**
 * 外观类
 *
 * @author pangenshan
 * @version 1.0
 * @date 2018/11/12 12:24
 */
public class PointsExchangeService {
    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void exchange(PointGifts pointGifts) {
        boolean qualify = qualifyService.isValiable(pointGifts);
        if (qualify) {
            boolean payFlag = pointsPaymentService.pay(pointGifts);
            if (payFlag) {
                String orderNo = shippingService.shipping(pointGifts);
                System.out.println(orderNo);
            }
        }
    }
}
