package ua.com.juja.core.lab35;

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        int index = poly.length - 1;
        BigInteger result = new BigInteger("0");
        for (BigInteger tmp : poly)
            result = result.add(tmp.multiply(arg.pow(index--)));
        return result;
    }
}
