package abstractTask.task2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    void print() {
        System.out.println(String.format("Rectangle has two sides a = %s, b = %s: perimeter = %s, square = %s", a, b, getPerimeter(), getArea()));
    }
}
