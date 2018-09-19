package ua.com.juja.core.lab03;

public class Test {
    public static void main(String[] args) {
        String actual;
        String expected;
        for (int i = -1; i < 13; i++) {
            actual = DayMonth.getMonthOfYear(i);
            switch (i) {
                case 1:
                    expected = "january";
                    break;
                case 2:
                    expected = "february";
                    break;
                case 3:
                    expected = "march";
                    break;
                case 4:
                    expected = "april";
                    break;
                case 5:
                    expected = "may";
                    break;
                case 6:
                    expected = "june";
                    break;
                case 7:
                    expected = "july";
                    break;
                case 8:
                    expected = "august";
                    break;
                case 9:
                    expected = "september";
                    break;
                case 10:
                    expected = "october";
                    break;
                case 11:
                    expected = "november";
                    break;
                case 12:
                    expected = "december";
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
