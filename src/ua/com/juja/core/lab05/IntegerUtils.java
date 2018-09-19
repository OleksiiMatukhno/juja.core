package ua.com.juja.core.lab05;

public class IntegerUtils {
    public static int leftShift(int arg) {
        return (arg << 1) | (arg >>> (Integer.SIZE - 1));
    }
}
