package ua.com.juja.core.lab12;

public class ArrayUtilsRef2 {
    public static int[] lookFor(int[] array) {
        int[] result = new int[]{0, 0};
        int[] temporary = new int[]{0, 0};
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            index = array[i] > 0 ? putIndexToTemporaryArray(temporary, index, i) : 0;
            if (index == 1) {
                CollateArrays(result, temporary);
                found = true;
            } else {
                // do nothing
            }
        }
        return found ? result : new int[]{};
    }

    private static int putIndexToTemporaryArray(int[] temporaryArray, int temporaryArrayIndex, int resultArrayIndex) {
        temporaryArray[temporaryArrayIndex] = resultArrayIndex;
        if (temporaryArrayIndex == 0) {
            return putIndexToTemporaryArray(temporaryArray, 1, resultArrayIndex);
        }
        return temporaryArrayIndex;
    }

    private static void CollateArrays(int[] resultArray, int[] temporaryArray) {
        if (resultArray[1] - resultArray[0] < temporaryArray[1] - temporaryArray[0]) {
            resultArray[0] = temporaryArray[0];
            resultArray[1] = temporaryArray[1];
        }
    }
}
