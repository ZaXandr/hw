package algorithm;

import java.util.Arrays;
import java.util.Random;

public class Task1_3 {

    public static void main(String[] args) {
        Task1_3.task(10, 10); // 10 замеров для 10 елементов
        Task1_3.task(100, 10); // 10 замеров для 100 елементов
        Task1_3.task(1000, 10); // 10 замеров для 1000 елементов
    }

    public static void task(int N, int count) {

        long[] result = new long[count];
        long sum = 0;
        for (int i = 0; i < count; i++) {
            int[] arr = Task2.randArray(N,100);
            long start = System.nanoTime();
            Task1_3.rand(arr);
            long time = System.nanoTime() - start;
            result[i] = time;
            sum += (time);
            System.out.println("Замер " + i + ": " + time);
        }
        System.out.println("Среднее время = " + sum / count + " наносекунд");
    }

    public static int[] rand(int[] array) {
        Random rd = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }


}
