package com.task010422.task2;

public class Demo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3);
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2,4);
        Square square = new Square(2);

        System.out.println("Square with side:= " + square.getA() + " area = " + square.area());
        System.out.println(String.format("Triangle with parameters h = %s, b = %s area = %s",
                triangle.getH(),triangle.getB(),triangle.area()));
        System.out.println("Circle with radius:= " + circle.getR() + " area = " + circle.area());
        System.out.println(String.format("Rectangle wit sides (%s,%s) area = %s",
                rectangle.getA(),rectangle.getB(),rectangle.area()));
    }
}
