package abstractTask.task2;

public class Demo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        rectangle.print();

        Shape triangle = new Triangle(3,4,5);
        triangle.print();

        Shape circle = new Circle(10);
        circle.print();
    }
}
