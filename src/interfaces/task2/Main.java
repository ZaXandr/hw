package interfaces.task2;

public class Main {
    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f,3.5f,10.1f);
        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);
        double temp = ((Circle) circle).getRadius();
        System.out.printf("radius %.3f \n", temp);
        MutableShape square = new Rectangle(0, 0, 1, 1);
        System.out.println(((Rectangle) square).getSquareArea());
        square.scale(2);
        System.out.println(((Rectangle) square).getSquareArea());

    }
}
