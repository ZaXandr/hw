package com.task010422.task2;

public class Circle extends Shape{
    private double r;
    private final double PI = Math.PI;

    public Circle(){}

    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getPI(){
        return PI;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }
}
