package ua.com.juja.core.lab37;

public class Test5 {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", -1);
        String expected = "BCA";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
