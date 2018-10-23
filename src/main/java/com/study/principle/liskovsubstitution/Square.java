package com.study.principle.liskovsubstitution;

/**
 * @author 潘根山
 * @create 2018-09-09 08:47
 * @since 1.0.0
 */
public class Square implements Quadrangle {

    private long sideLength;

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}