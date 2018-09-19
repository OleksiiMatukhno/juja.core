package ua.com.juja.core.lab20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }

    public static void permutation(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                permutation(arr, size - 1);
                swap(arr, size - 1, k);
            }
        }
    }

    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
