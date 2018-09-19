package ua.com.juja.core.lab22;

public class TestEmpty {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][] {null});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
