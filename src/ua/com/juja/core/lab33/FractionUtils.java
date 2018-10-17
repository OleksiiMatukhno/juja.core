package ua.com.juja.core.lab33;

import java.math.BigInteger;

public class FractionUtils {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[2];
        result[1] = x[1].multiply(y[1]);
        result[0] = x[1].multiply(y[0]);
        result[0] = result[0].add(x[0].multiply(y[1]));
        BigInteger divider = result[1].gcd(result[0]);
        result[0] = result[0].divide(divider);
        result[1] = result[1].divide(divider);
        return result;
    }
}
