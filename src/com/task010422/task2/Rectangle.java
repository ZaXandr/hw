package com.task010422.task2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(){

    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
}
