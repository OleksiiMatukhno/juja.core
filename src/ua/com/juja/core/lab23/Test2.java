package ua.com.juja.core.lab23;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[][][] oldArray = {
                {
                        {1, 2},
                        {3, 4},
                },
                {
                        {5, 6},
                        {7, 8},
                },
        };
        int[][][] newExpectedArray = {
                {
                        {1, 5},
                        {2, 6},
                },
                {
                        {3, 7},
                        {4, 8},
                },
        };
        int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
