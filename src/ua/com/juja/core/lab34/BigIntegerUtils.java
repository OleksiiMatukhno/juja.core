package ua.com.juja.core.lab34;

import java.math.BigInteger;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        byte[] byteArray = arg.toByteArray();
        String result = "";
        for (int i = byteArray.length - 1; i >= 0; i--) {
            String nextByte = Integer.toBinaryString(byteArray[i]);

            if (nextByte.length() > 8)
                nextByte = nextByte.substring(nextByte.length() - 8);

            if (i > 0) {
                while (nextByte.length() < 8)
                    nextByte = '0' + nextByte;
            } else if (byteArray.length > 1 && nextByte.equals("0"))
                return result;

            result = nextByte + result;
        }
        return result;
    }
}
