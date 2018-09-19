package ua.com.juja.core.lab16;

import org.junit.Test;
import ua.com.juja.core.lab19.ExchangeMoney;

import static org.junit.Assert.assertEquals;

public class ExchangeMoneyTest {
    @Test
    public void Test() {
        assertEquals(4, ExchangeMoney.exchangeAmountOfCoinsBrutForce(5));
        assertEquals(11, ExchangeMoney.exchangeAmountOfCoinsBrutForce(10));
        assertEquals(3953, ExchangeMoney.exchangeAmountOfCoinsBrutForce(100));
        assertEquals(233_639, ExchangeMoney.exchangeAmountOfCoinsBrutForce(278));
//        assertEquals(514_766, ExchangeMoney.exchangeAmountOfCoinsBrutForce(333));
//        assertEquals(589_078_306, ExchangeMoney.exchangeAmountOfCoinsBrutForce(1500));

    }

}
