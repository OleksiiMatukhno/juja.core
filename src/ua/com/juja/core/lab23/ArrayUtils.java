package ua.com.juja.core.lab23;

public class ArrayUtils {
    public static int[][][] rotateClockwise(int[][][] arg) {
        return notCorrect(arg) ? null : Clockwise(arg);
    }

    private static boolean notCorrect(int[][][] arg) {
        return (arg == null || arg.length == 0 ||
                arg[0] == null || arg[0].length == 0 ||
                arg[0][0] == null || arg[0][0].length == 0 ||
                arg.length != arg[0].length || arg.length != arg[0][0].length);

    }

    private static boolean notCorrect(int[][][] arg, int index) {
        return ((Object) arg[index] == null ||
                arg[index].length != arg[0].length);

    }

    private static boolean notCorrect(int[][][] arg, int index1, int index2) {
        return ((Object) arg[index1][index2] == null ||
                arg[index1][index2].length != arg[0][0].length);

    }

    private static int[][][] Clockwise(int[][][] source) {
        int[][][] result = new int[source.length][source.length][source.length];
        for (int i = 0; i < source.length; i++) {
            if (notCorrect(source, i)) return null;
            result = Clockwise(result, source, i);
        }
        debug(result);
        return result;
    }

    private static int[][][] Clockwise(int[][][] result, int[][][] source, int index) {
        for (int i = 0; i < source.length; i++) {
            if (notCorrect(source, index, i)) return null;
            result = Clockwise(result, source, index, i);
        }
        return result;
    }

    private static int[][][] Clockwise(int[][][] result, int[][][] source, int index1, int index2) {
        for (int i = 0; i < source.length; i++) {
            result[index1][index2][i] = index1 != index2 || index1 != i ?
                    source[i][index1][index2] :
                    source[index1][index2][i];
        }
        return result;
    }

    private static void debug(int[][][] result) {
        String r = "";

        for (int i = 0; i < result.length; i++) {
            r += "{\n";
            for (int j = 0; j < result[i].length; j++) {
                r += "\t{";
                for (int k = 0; k < result[i][j].length; k++) {
                    r += k > 0 ? ",\t" + result[i][j][k] : result[i][j][k];
                }
                r += "}\n";

            }
            r += "}\n";
        }
        System.out.println(r);

    }
}
