package ua.com.juja.core.lab11;

public class MathUtils {
    public static int lookFor(int max) {
        int count = 0;
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                if (i*i+j*j>max)
                    break;
                count++;
            }
        }
        return count;
    }
}
