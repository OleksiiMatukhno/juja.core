package ua.com.juja.core.lab37;

public class Test1000000 {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("", -1000000);
        String expected = "";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
