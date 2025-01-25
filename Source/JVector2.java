package com.vectors.utils;

import com.vectors.utils.interfaces.JVectorsInterface;

public class JVector2 implements JVectorsInterface {
    private int x, y;

    public JVector2() {
        Zero();
    }

    public JVector2(int value) {
        x = y = value;
    }

    public JVector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int value) {
        x = y = value;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void Zero() {
        x = y = 0;
    }

    @Override
    public void Up() {
        Zero();
        this.y = 1;
    }

    @Override
    public void Down() {
        Zero();
        this.y = -1;
    }
}