package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        byte[] byteArray = arg.toByteArray();
        String result = "";
        for (int i = byteArray.length - 1; i >= 0; i--) {
            String nextByte = Integer.toBinaryString(byteArray[i]);
            result = i != 0 ? ("00000000" + nextByte).substring(nextByte.length()) + result
                    : !nextByte.equals("0") ? nextByte + result
                    : byteArray.length == 1 ? nextByte
                    :result;
        }
        return result;
    }
}
