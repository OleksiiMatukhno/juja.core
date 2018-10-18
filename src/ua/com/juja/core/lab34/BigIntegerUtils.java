package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        byte[] byteArray = arg.toByteArray();
        if (byteArray.length == 1)
            return Integer.toBinaryString(byteArray[0]);
        int index = byteArray.length;
        String result = "";
        while (--index > 0) {
            String nextByte = Integer.toBinaryString(byteArray[index]);
            result = ("00000000" + nextByte).substring(nextByte.length()) + result;
        }
        if (byteArray[index] != 0)
            return Integer.toBinaryString(byteArray[index]) + result;
        return result;
    }
}
