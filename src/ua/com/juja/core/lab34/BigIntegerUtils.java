package ua.com.juja.core.lab34;

import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        byte[] byteArray = arg.toByteArray();
        if (byteArray.length == 1)
            return Integer.toBinaryString(byteArray[0]);
        String result = new String("");
        for (int i = byteArray.length - 1; i >= 0; i--) {
            String tmp = Integer.toBinaryString(byteArray[i]);
            if (tmp.length() > 8) {
                tmp = tmp.substring(tmp.length() - 8);
            }
            if (i > 0) {
                while (tmp.length() < 8) {
                    tmp = '0' + tmp;
                }
            } else {
                if (tmp.equals("0")) {
                    return result;
                }
            }

            result = tmp + result;
        }
        return result;
    }
}
