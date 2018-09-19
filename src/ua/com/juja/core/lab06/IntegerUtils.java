package ua.com.juja.core.lab06;

public class IntegerUtils {
    public static int rightShift(int arg) {
        return (arg >>> 1) | (arg << (Integer.SIZE - 1));
    }
}
