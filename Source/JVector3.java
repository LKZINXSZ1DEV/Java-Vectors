package com.vectors.utils;

import com.vectors.utils.interfaces.JVectorsInterface;

public class JVector3 implements JVectorsInterface {
    private int x, y, z;

    public JVector3() {
        Zero();
    }

    public JVector3(int value) {
        x = y = z = value;
    }

    public JVector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void setXYZ(int value) {
        x = y = z = value;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void Zero() {
        x = y = z = 0;
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
