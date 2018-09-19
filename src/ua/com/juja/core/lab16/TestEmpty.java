package ua.com.juja.core.lab16;

import ua.com.juja.core.lab19.ExchangeMoney;

public class TestEmpty {
    public static void main(String[] args) {

        int testMoney = 0;
        int expectedValue = 0;

        int actualValue = ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue != expectedValue)
            throw new AssertionError("Money= " + testMoney + " number of variants= " + expectedValue + " but found " + actualValue);

        System.out.print("OK");

    }
}
