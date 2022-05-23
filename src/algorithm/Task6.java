package algorithm;

import java.util.Random;

public class Task6 {

    public static final int RANGE = 1000000;

    public static void main(String[] args) {
        Task6.task(100, RANGE);
        Task6.task(1000, RANGE);
        Task6.task(10000, RANGE);
        Task6.task(100000, RANGE);
        Task6.task(1000000, RANGE);

    }

    public static void task(int N,int range){

        int[] arr = Task2.randArray(N,range);
        long time = System.nanoTime();
        Task6.quickSort(arr,0,N-1);
        System.out.print("Количество елементов: " + N + " выполнило за: ");
        System.out.print(System.nanoTime()-time);
        System.out.println(" наносекунд");

    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
