package ua.com.juja.core.lab37;

public class Test2 {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", 2);
        String expected = "BCA";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
