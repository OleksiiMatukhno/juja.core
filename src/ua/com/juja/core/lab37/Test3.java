package ua.com.juja.core.lab37;

public class Test3 {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", 3);
        String expected = "ABC";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
