package ua.com.juja.core.lab12;

public class ArrayUtilsRef5 {
    private static int[] result = new int[]{0, 0};
    private static int[] temporary = new int[]{0, 0};
    private static int index = 0;

    public static int[] lookFor(int[] array) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            index = array[i] > 0 ? 1 : 0;
            if (index == 1) {
                putIndexToTemporaryArray(i);
                сollateArrays();
                found = true;
            } else {
                // do nothing
            }
        }
        return found ? result : new int[0];
    }

    private static void putIndexToTemporaryArray(int resultArrayIndex) {
        temporary[index] = resultArrayIndex;
        if (index == 0) {
            index = 1;
            temporary[index] = resultArrayIndex;
        }
    }

    private static void сollateArrays() {
        if (result[1] - result[0] < temporary[1] - temporary[0]) {
            result = temporary.clone();
        }
    }
}
