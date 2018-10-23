package com.study.principle.compositionaggregation;

/**
 * @author 潘根山
 * @create 2018-09-09 10:24
 * @since 1.0.0
 */
public class OracleConnection extends DBConnection {
    @Override
    String getConnection() {
        return "Oracle数据库连接";
    }
}
