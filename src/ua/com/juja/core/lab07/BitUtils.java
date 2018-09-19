package ua.com.juja.core.lab07;

public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        int bit1pos = 1 << i;
        int bit2pos = 1 << j;
        if ((b & bit1pos) == 0 ^ (b & bit2pos) == 0) {
            b ^= bit1pos | bit2pos;
        }
        return b;
    }
}
