package ua.com.juja.core.lab34;

import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        String result = new String("");
        byte[] byteArray = arg.toByteArray();
        for (int i = byteArray.length - 1; i >=0 ; i--) {
            byte v = byteArray[i];
            if (v < 0) {

            }
            String tmp = Integer.toBinaryString((byte)byteArray[i]);
            if (i > 0) {
                while (tmp.length() < 8) {
                    tmp = '0' + tmp;
                }
            }
            result = tmp + result;
        }
        return result;
    }
}
