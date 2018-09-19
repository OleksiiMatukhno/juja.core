package ua.com.juja.core.lab02;

public class Test {
    public static void main(String[] args) {
        String actual = EggsBread.printPurchases(true, true);
        String expected = "eggs,bread";
        if (!actual.equals(expected))
            throw new AssertionError("result= " + expected + " but found " + actual);

        actual = EggsBread.printPurchases(true, false);
        expected = "eggs";
        if (!actual.equals(expected))
            throw new AssertionError("result= " + expected + " but found " + actual);

        actual = EggsBread.printPurchases(false, true);
        expected = "bread";
        if (!actual.equals(expected))
            throw new AssertionError("result= " + expected + " but found " + actual);

        actual = EggsBread.printPurchases(false, false);
        expected = "";
        if (!actual.equals(expected))
            throw new AssertionError("result= " + expected + " but found " + actual);

        System.out.print("OK");
    }
}
