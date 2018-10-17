package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class Test1 {
    public static void main(String[] args) {
        BigInteger k = new BigInteger("256")
                .add(new BigInteger("64"))
                .add(new BigInteger("16"))
                .add(new BigInteger("4"))
                .add(new BigInteger("1"));

        String expected = "101010101";
        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
