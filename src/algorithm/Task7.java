package algorithm;

import java.util.Arrays;
import java.util.Random;

public class Task7 {

    public static void main(String[] args)
    {
        int N = 10 ;
        int[] arr = Task2.randArray(N,100);
        System.out.println(Arrays.toString(arr));
        int[] result = new int[10];
        for (int i = 0; i < N; i++) {
            int k= i + 1;
            result[i] = quickSelect(arr, 0, arr.length - 1, k - 1);
        }
        System.out.println(Arrays.toString(result));
    }



    public static int rand(int min, int max)
    {
        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }
        return new Random().nextInt(max - min + 1) + min;
    }
    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int partition(int[] nums, int left, int right, int pIndex)
    {

        int pivot = nums[pIndex];

        swap(nums, pIndex, right);

        pIndex = left;

        for (int i = left; i < right; i++)
        {
            if (nums[i] <= pivot)
            {
                swap(nums, i, pIndex);
                pIndex++;
            }
        }

        swap(nums, pIndex, right);
        return pIndex;
    }

    public static int quickSelect(int[] nums, int left, int right, int k)
    {
        if (left == right) {
            return nums[left];
        }

        int pIndex = rand(left, right);

        pIndex = partition(nums, left, right, pIndex);

        if (k == pIndex) {
            return nums[k];
        }

        else if (k < pIndex) {
            return quickSelect(nums, left, pIndex - 1, k);
        }

        else {
            return quickSelect(nums, pIndex + 1, right, k);
        }
    }

}
