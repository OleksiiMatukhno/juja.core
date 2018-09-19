package ua.com.juja.core.lab18;

public class ParserSourceTest {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + ParserSource.eval("123"));
        System.out.println(">> 2*3 = " + ParserSource.eval("2*3"));
        System.out.println(">> 2*(1+3) = " + ParserSource.eval("2*(1+3)"));
        System.out.println(">> 1+(5-2*(13/6)) = " + ParserSource.eval("1+(5-2*(13/6))"));
    }
}
