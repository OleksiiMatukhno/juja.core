package ua.com.juja.core.lab22;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[][] oldArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] newExpectedArray = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
