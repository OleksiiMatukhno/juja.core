package ua.com.juja.core.lab34;

import jdk.nashorn.internal.runtime.BitVector;
import sun.security.util.BitArray;

import java.math.BigInteger;
import java.util.BitSet;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        byte[] byteArray = arg.toByteArray();
        int index = byteArray.length;
        String result = "";
        while (--index >= 0) {
            String nextByte = Integer.toBinaryString(byteArray[index]);
            if (index != 0) {
                result = ("00000000" + nextByte).substring(nextByte.length()) + result;
                continue;
            }
            if (nextByte.length() > 8)
                nextByte = nextByte.substring(nextByte.length() - 8);
            if (byteArray[index] != 0)
                return nextByte + result;
            if (byteArray.length == 1)
                return nextByte;
        }
        return result;
    }
}
