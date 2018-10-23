package com.study.principle.compositionaggregation;

/**
 * @author 潘根山
 * @create 2018-09-09 10:23
 * @since 1.0.0
 */
public class MyConnection extends DBConnection {
    @Override
    String getConnection() {
        return "Mysql数据库连接";
    }
}