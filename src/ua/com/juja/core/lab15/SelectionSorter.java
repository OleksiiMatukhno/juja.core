package ua.com.juja.core.lab15;

import java.util.Arrays;

public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minValue = arr[barrier];
            int minValueIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (minValue > arr[index]) {
                    minValue = arr[index];
                    minValueIndex = index;
                } else {
                    //do nothing
                }
            }
            if (minValueIndex != barrier) {
                arr[minValueIndex] = arr[barrier];
                arr[barrier] = minValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
