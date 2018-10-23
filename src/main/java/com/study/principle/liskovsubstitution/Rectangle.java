package com.study.principle.liskovsubstitution;

/**
 * @author 潘根山
 * @create 2018-09-09 08:46
 * @since 1.0.0
 */
public class Rectangle implements Quadrangle{
    private long length;

    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}