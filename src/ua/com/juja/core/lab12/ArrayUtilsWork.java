package ua.com.juja.core.lab12;

public class ArrayUtilsWork {
    public static int[] lookFor(int[] array) {
        int[] result = new int[]{0,0};
        int[] temp = new int[]{0,0};
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                temp[index] = i;
                index = 1;
                temp[index] = i;
                found = true;
            } else {
                index = 0;
            }
            if (result[1] - result[0] < temp[1] - temp[0]) {
                result[0] = temp[0];
                result[1] = temp[1];
            }
        }
        return found ? result : new int[]{};
    }
}
