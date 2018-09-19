package ua.com.juja.core.lab12;

public class ArrayUtilsRef {
    public static int[] lookFor(int[] array) {
        int[] result = new int[]{0, 0};
        int[] temp = new int[]{0, 0};
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            index = array[i] > 0 ? CheckArray(temp, index, i) : 0;
            if (index == 1) {
                CollateArrays(result, temp);
                found = true;
            } else {
                // do nothing
            }
        }
        return found ? result : new int[]{};
    }

    private static int CheckArray(int[] temp, int tempIndex, int resultIndex) {
        temp[tempIndex] = resultIndex;
        if (tempIndex == 0) {
            tempIndex = 1;
            temp[tempIndex] = resultIndex;
        }
        return tempIndex;
    }

    private static void CollateArrays(int[] result, int[] temp) {
        if (result[1] - result[0] < temp[1] - temp[0]) {
            result[0] = temp[0];
            result[1] = temp[1];
        }
    }
}
