package com.study.principle.compositionaggregation;

/**
 * @author 潘根山
 * @create 2018-09-09 10:20
 * @since 1.0.0
 */
public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加商品");
    }
}