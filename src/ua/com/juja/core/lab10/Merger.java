package ua.com.juja.core.lab10;

public class Merger {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex != result.length) {
            if (fst.length == fstIndex){
                result[fstIndex + sndIndex] = snd[sndIndex++];
                continue;
            }
            if (snd.length == sndIndex){
                result[fstIndex + sndIndex] = fst[fstIndex++];
                continue;
            }
            if (snd[sndIndex] > fst[fstIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        return result;
    }
}
