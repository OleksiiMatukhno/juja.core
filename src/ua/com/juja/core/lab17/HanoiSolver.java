package ua.com.juja.core.lab17;

import java.util.Stack;

public class HanoiSolver {
    public static void exchange(Stack from, Stack help, Stack to, int count)  {
        if (count > 0) {
            exchange(from, to, help, --count);
            int biggest = (int) from.pop();
            to.push(biggest);
            exchange(help, from, to, count++);
        }
    }
}
