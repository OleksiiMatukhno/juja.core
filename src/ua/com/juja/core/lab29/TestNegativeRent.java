package ua.com.juja.core.lab29;

public class TestNegativeRent {
    public static void main(String[] args) {
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        float testRentTaxNegative = -1;

        float expectedTankerPaymentRentTaxDefault = testTankerVolume * Tanker.DEFAULT_RENTAL;

        Tanker tanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        //check payment if rent tax is negative
        float actualTankerPaymentRentTaxNegative = tanker.calculatePayment(testRentTaxNegative);
        if (actualTankerPaymentRentTaxNegative != expectedTankerPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is negative= " + testRentTaxNegative + " and expected payment value= " + expectedTankerPaymentRentTaxDefault + " but found " + actualTankerPaymentRentTaxNegative);


        System.out.print("OK");
    }
}
