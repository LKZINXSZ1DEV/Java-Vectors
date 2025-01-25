package com.vectors.utils;

public class JVectorManager {

    public static JVector2 Sum(JVector2 value1, JVector2 value2) {
        return new JVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY());
    }

    public static JVector2 Sum(JVector2 value1, JVector3 value2) {
        return new JVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY());
    }

    public static JVector2 Sum(JVector2 value1, JVector4 value2) {
        return new JVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY());
    }

    public static JVector3 Sum(JVector3 value1, JVector2 value2) {
        return new JVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ());
    }

    public static JVector3 Sum(JVector3 value1, JVector3 value2) {
        return new JVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ());
    }

    public static JVector3 Sum(JVector3 value1, JVector4 value2) {
        return new JVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ());
    }

    public static JVector4 Sum(JVector4 value1, JVector2 value2) {
        return new JVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ(), value1.getW());
    }

    public static JVector4 Sum(JVector4 value1, JVector3 value2) {
        return new JVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ(), value1.getW());
    }

    public static JVector4 Sum(JVector4 value1, JVector4 value2) {
        return new JVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ(), value1.getW() + value2.getW());
    }

    public static JVector2 Multiply(JVector2 value1, JVector2 value2) {
        return new JVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY());
    }

    public static JVector2 Multiply(JVector2 value1, JVector3 value2) {
        return new JVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY());
    }

    public static JVector2 Multiply(JVector2 value1, JVector4 value2) {
        return new JVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY());
    }

    public static JVector3 Multiply(JVector3 value1, JVector2 value2) {
        return new JVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ());
    }

    public static JVector3 Multiply(JVector3 value1, JVector3 value2) {
        return new JVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ());
    }

    public static JVector3 Multiply(JVector3 value1, JVector4 value2) {
        return new JVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ());
    }

    public static JVector4 Multiply(JVector4 value1, JVector2 value2) {
        return new JVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ(), value1.getW());
    }

    public static JVector4 Multiply(JVector4 value1, JVector3 value2) {
        return new JVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ(), value1.getW());
    }

    public static JVector4 Multiply(JVector4 value1, JVector4 value2) {
        return new JVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ(), value1.getW() * value2.getW());
    }

    public static JVector2 Divide(JVector2 value1, JVector2 value2) {
        return new JVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY());
    }

    public static JVector2 Divide(JVector2 value1, JVector3 value2) {
        return new JVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY());
    }

    public static JVector2 Divide(JVector2 value1, JVector4 value2) {
        return new JVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY());
    }

    public static JVector3 Divide(JVector3 value1, JVector2 value2) {
        return new JVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ());
    }

    public static JVector3 Divide(JVector3 value1, JVector3 value2) {
        return new JVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ());
    }

    public static JVector3 Divide(JVector3 value1, JVector4 value2) {
        return new JVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ());
    }

    public static JVector4 Divide(JVector4 value1, JVector2 value2) {
        return new JVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ(), value1.getW());
    }

    public static JVector4 Divide(JVector4 value1, JVector3 value2) {
        return new JVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ(), value1.getW());
    }

    public static JVector4 Divide(JVector4 value1, JVector4 value2) {
        return new JVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ(), value1.getW() / value2.getW());
    }
}