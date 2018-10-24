package ua.com.juja.core.lab36;

import java.math.BigInteger;
import java.util.Arrays;

public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[x.length + y.length - 1];
        for (int indexX = 0; indexX < x.length; indexX++)
            for (int indexY = 0; indexY < y.length; indexY++) {
                int indexResult = indexX + indexY;
                result[indexResult] = result[indexResult] == null
                                    ? new BigInteger((x[indexX].multiply(y[indexY])).toString())
                                    : result[indexResult].add(x[indexX].multiply(y[indexY]));
            }
        return result;
    }
}
