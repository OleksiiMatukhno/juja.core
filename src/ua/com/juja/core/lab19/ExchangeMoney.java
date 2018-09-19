package ua.com.juja.core.lab19;

import java.util.Arrays;

public class ExchangeMoney {
    private static final int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        return amountForExchange <= 0 ? 0 : sum(coinNominals, amountForExchange);
    }

    private static int sum(int[] coinNominals, int amountForExchange) {
        if (amountForExchange < 0) {
            return 0;
        }
        if (coinNominals.length < 2) {
            return 1;
        }
        return sum(coinNominals, amountForExchange - coinNominals[coinNominals.length - 1]) +
                sum(Arrays.copyOf(coinNominals, coinNominals.length - 1), amountForExchange);
    }
}
