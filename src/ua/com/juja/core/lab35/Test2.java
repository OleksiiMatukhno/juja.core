package ua.com.juja.core.lab35;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("2");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError("expected: " + expected + " but actual: " + actual);
        }

        System.out.print("OK");
    }
}
