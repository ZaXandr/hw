package abstractTask.task2;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    void print() {
        System.out.println(String.format("Triangle has three sides: a = %s, b = %s, c = %s, perimeter = %s, square = %s",
                a,b,c,getPerimeter(),getArea()));
    }
}
