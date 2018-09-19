package ua.com.juja.core.lab14;

public class BubbleSorter {
    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier > 0; barrier--) {
            for (int index = arr.length - 1; index > arr.length - barrier - 1 ; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
}
