package ua.com.juja.core.lab22;

public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0 || arg[0] == null ||
                arg[0].length == 0 || arg.length != arg[0].length)
            return null;
        int[][] result = new int[arg.length][arg.length];
        for (int i = 0; i < arg.length; i++) {
            if ((Object) arg[i] == null || arg[i].length != arg[0].length)
                return null;
            for (int j = arg[i].length - 1; j >= 0; j--) {
                if ((Object) arg[i][j] == null) {
                    return null;
                }
                result[j][arg.length - 1 - i] = arg[i][j];
            }
        }
        return result;
    }
}
