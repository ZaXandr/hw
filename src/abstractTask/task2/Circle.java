package abstractTask.task2;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI*r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    void print() {
        System.out.println(String.format("Circle has radius: %s, perimeter = %s, square = %s", r, getPerimeter(), getArea()));
    }
}
