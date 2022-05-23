package abstractTask.task1;

public class Demo {
    public static void main(String[] args) {
        IntBinaryOperation multiplication = new Multiplication(1,2);
        System.out.println(multiplication.perform());

        IntBinaryOperation addition = new Addition(2,3);
        System.out.println(addition.perform());
    }
}
