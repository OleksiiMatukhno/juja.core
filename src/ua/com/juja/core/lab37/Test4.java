package ua.com.juja.core.lab37;

public class Test4 {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", 4);
        String expected = "CAB";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
