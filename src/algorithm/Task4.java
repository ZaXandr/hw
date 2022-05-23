package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {2,4,6,8};
        System.out.println(Arrays.toString(union(arr1, arr2)));
        System.out.println(Arrays.toString(intersection(arr1,arr2)));

    }

    public static Integer[] union(Integer[] arr1, Integer[] arr2){
        Set<Integer> result = new HashSet<Integer>(Arrays.asList(arr1));
        result.addAll(Arrays.asList(arr2.clone()));

        Integer[] union = new Integer[result.size()];

        return result.toArray(union);
    }

    public static Integer[] intersection(Integer[] arr1, Integer[] arr2){
        Set<Integer> result = new HashSet<Integer>(Arrays.asList(arr1));
        result.retainAll(Arrays.asList(arr2));
        Integer[] intersection = new Integer[result.size()];
        result.toArray(intersection);
        return result.toArray(intersection);

    }
}
