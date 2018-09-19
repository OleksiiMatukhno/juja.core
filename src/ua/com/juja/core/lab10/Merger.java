package ua.com.juja.core.lab10;

public class Merger {
    public static int[] mergeInvert(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (fstIndex == fst.length) {
                result[i] = snd[sndIndex++];
                continue;
            }
            if (sndIndex == snd.length) {
                result[i] = fst[fstIndex++];
                continue;
            }
            if (fst[fstIndex] < snd[sndIndex]) {
                result[i] = fst[fstIndex++];
            } else {
                result[i] = snd[sndIndex++];
            }
        }
        return result;
    }
}
