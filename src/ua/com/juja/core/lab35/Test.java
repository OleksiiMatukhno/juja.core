package ua.com.juja.core.lab35;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("10")};
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("10");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError("expected: " + expected + " but actual: " + actual);
        }

        System.out.print("OK");
    }
}
