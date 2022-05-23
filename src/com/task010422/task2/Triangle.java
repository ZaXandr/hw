package com.task010422.task2;

public class Triangle extends Shape{
     private double h;
     private double b;

    public Triangle() {
    }

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return h*b/2;
    }
}
