package com.vectors.utils;

import com.vectors.utils.interfaces.JVectorsInterface;

public class JVector4 implements JVectorsInterface {
    private int x, y, z, w;

    public JVector4() {
        Zero();
    }

    public JVector4(int value) {
        x = y = z = w = value;
    }

    public JVector4(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setXYZW(int value) {
        x = y = z = w = value;
    }

    public void setXYZW(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    @Override
    public void Zero() {
        x = y = z = w = 0;
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
