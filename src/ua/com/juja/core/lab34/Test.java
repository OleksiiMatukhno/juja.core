package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger k = new BigInteger("10");
        String expected = "1010";
        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
