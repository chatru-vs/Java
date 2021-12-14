package com.company;
import java.util.Arrays;

public class learnarrayclass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        int index1 = Arrays.binarySearch(numbers, 8);
        System.out.println("the fourth element of array is "  + index);
        System.out.println("the fourth element of array is "  + index1);
        Integer[] stats = { 10, 16, 13, 14, 11 };
        Arrays.sort(stats);
        Arrays.fill(stats, 19);
                for (int i : stats){
            System.out.println(i + "");
        }
    }
}
