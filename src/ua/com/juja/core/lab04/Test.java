package ua.com.juja.core.lab04;

public class Test {
    public static void main(String[] args) {
        String actual;
        String expected;
        for (int i = -1; i < 13; i++) {
            actual = DayWeek.getDayOfTheWeek(i);
            switch (i) {
                case 1:
                    expected = "Monday";
                    break;
                case 2:
                    expected = "Tuesday";
                    break;
                case 3:
                    expected = "Wednesday";
                    break;
                case 4:
                    expected = "Thursday";
                    break;
                case 5:
                    expected = "Friday";
                    break;
                case 6:
                    expected = "Saturday";
                    break;
                case 7:
                    expected = "Sunday";
                    break;
                default:
                    expected = "";

            }
            if (!actual.equals(expected))
                throw new AssertionError("result= " + expected + " but found " + actual);
        }
        System.out.print("OK");
    }
}
