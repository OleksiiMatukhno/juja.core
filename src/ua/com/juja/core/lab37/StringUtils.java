package ua.com.juja.core.lab37;

import java.util.Collections;

public class StringUtils {
    public static String rightShift(String arg, int delta) {
        if (arg.length() == 0)
            return arg;
        int shift = delta > 0 ? arg.length() - delta % arg.length()
                              : -(delta % arg.length());
        return arg.substring(shift) + arg.substring(0, shift);
    }
}
