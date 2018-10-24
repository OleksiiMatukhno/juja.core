package ua.com.juja.core.lab36;

import java.math.BigInteger;
import java.util.Arrays;

public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[x.length + y.length - 1];
        for (int indexX = 0; indexX < x.length; indexX++) {
            for (int indexY = 0; indexY < y.length; indexY++) {
                if (result[indexX + indexY] == null)
                    result[indexX + indexY] = new BigInteger("0");
                result[indexX + indexY] = result[indexX + indexY].add(x[indexX].multiply(y[indexY]));
            }
        }
        return result;
    }
}
