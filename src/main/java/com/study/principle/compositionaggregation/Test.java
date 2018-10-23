package com.study.principle.compositionaggregation;

/**
 * @author 潘根山
 * @create 2018-09-09 10:22
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}