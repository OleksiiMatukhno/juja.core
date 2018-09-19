package ua.com.juja.core.lab22;

public class TestChildEmpty {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[0][]);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
