package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class Test1000000000 {
    public static void main(String[] args) {

        BigInteger k = BigInteger.ZERO;
        for (int i = 1; i <= 100; i++) {
            k = k.add(new BigInteger("2").pow(10 * i - 1));
        }

        String expected = "";
        for (int i = 0; i < 100; i++) {
            expected += "1000000000";
        }

        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
            throw new AssertionError("expected: " + expected + "but actual: " + actual);
        }

        System.out.print("OK");
    }
}
