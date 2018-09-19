package ua.com.juja.core.lab12;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1};
        int[] expected = {1, 3};
        int[] actual = ArrayUtilsRef3.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
