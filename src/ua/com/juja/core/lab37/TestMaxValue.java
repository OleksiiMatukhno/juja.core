package ua.com.juja.core.lab37;

public class TestMaxValue {
    public static void main(String[] args) {
        // Integer.MAX_VALUE = 2147483647
        // Integer.MIN_VALUE = -2147483648
        String actual = StringUtils.rightShift("0123456789", Integer.MAX_VALUE);
        String expected = "3456789012";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
