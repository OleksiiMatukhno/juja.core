package ua.com.juja.core.lab23;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][][] oldArray = {{{1}}};
        int[][][] newExpectedArray = {{{1}}};
        int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
