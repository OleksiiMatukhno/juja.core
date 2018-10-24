package ua.com.juja.core.lab37;

public class Test {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", 1);
        String expected = "CAB";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
