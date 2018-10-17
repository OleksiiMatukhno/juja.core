package ua.com.juja.core.lab33;

import java.math.BigInteger;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] expected = {new BigInteger("1"), new BigInteger("1")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
