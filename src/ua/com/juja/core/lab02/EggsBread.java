package ua.com.juja.core.lab02;

public class EggsBread {
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        return hasEggs && hasBread ? "eggs,bread" : hasEggs ? "eggs" : hasBread ? "bread" : "";
    }
}
