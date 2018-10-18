package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class TestZero {
    public static void main(String[] args) {
        BigInteger k = new BigInteger("0");
        String expected = "0";
        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
            throw new AssertionError("expected: " + expected + " but actual: " + actual);
        }

        System.out.print("OK");
    }
}
