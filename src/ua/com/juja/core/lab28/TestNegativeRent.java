package ua.com.juja.core.lab28;

public class TestNegativeRent {
    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float testRentTaxNegative = (float) -0.001;
        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if  rent tax is negative
        float actualLinerPaymentRentTaxNegative = liner.calculatePayment(testRentTaxNegative);
        if (actualLinerPaymentRentTaxNegative != expectedLinerPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is negative= "+ testRentTaxNegative+" and expected payment value= " + expectedLinerPaymentRentTaxDefault + " but found " + actualLinerPaymentRentTaxNegative);

        System.out.print("OK");

    }
}
