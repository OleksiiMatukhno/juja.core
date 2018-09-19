package ua.com.juja.core.lab18;

public class Parser {
    public static void main(String[] args) {
        System.out.println(eval("123"));
        System.out.println(eval("2*3"));
        System.out.println(eval("(1+3)*2"));
        System.out.println(eval("((13/6)*5-2)+1"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length() - 1);
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(to) == ')') {
            return eval(expr, from + 1, to - 1);
        } else {
            int pos = to;
            while (pos > from) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    int rightOperand = Integer.valueOf(expr.substring(pos + 1, to + 1));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, from, pos - 1);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to + 1));
        }
    }
}
