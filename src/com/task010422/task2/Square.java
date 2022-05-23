package com.task010422.task2;

public class Square extends Shape{
    private double a;

    public Square(){}

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }
}
