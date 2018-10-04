package ua.com.juja.core.lab30;

public class TestNegativeRent {
    public static void main(String[] args) {
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;

        float testRentTaxNegative = -1;
        float expectedCargoPaymentRentTaxDefault = testCargoTonnage * Cargo.DEFAULT_RENTAL;

        Cargo cargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);

        //check payment if rent tax is negative
        float actualCargoPaymentRentTaxNegative = cargo.calculatePayment(testRentTaxNegative);
        if (actualCargoPaymentRentTaxNegative != expectedCargoPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is negative= " + testRentTaxNegative + " and expected payment value= " + expectedCargoPaymentRentTaxDefault + " but found " + actualCargoPaymentRentTaxNegative);

        System.out.print("OK");

    }
}
