package ua.com.juja.core.lab21;

public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        if (snd.length == 0 || fst.length != snd[0].length)
            throw new IllegalArgumentException();
        int[][] result = new int[fst.length][snd[0].length];
        for (int row = 0; row < fst.length; row++) {
            if (fst[row] == null) {
                throw new IllegalArgumentException();
            } else {
                for (int col = 0; col < snd[0].length; col++) {
                    if (fst[row] == null) {
                        throw new IllegalArgumentException();
                    } else {
                        for (int i = 0; i < snd[0].length; i++) {
                            result[row][col] += fst[row][i] * snd[i][col];
                        }
                    }
                }
            }
        }
        return result;
    }
}
