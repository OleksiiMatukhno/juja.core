package ua.com.juja.core.lab12;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {0, 4};
        int[] actual = ArrayUtilsRef5.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
