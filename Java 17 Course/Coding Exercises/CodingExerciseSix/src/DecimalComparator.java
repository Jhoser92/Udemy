public class DecimalComparator {

    public static void main(String[] args) {

        double num1 = 1.234d;
        double num2 = 2.345d;

        System.out.println(areEqualByThreeDecimalPlaces(num1, num2));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        long roundedOne = (long) (num1 * 1000);
        long roundedTwo = (long) (num2 * 1000);

        if (roundedOne == roundedTwo) {
            return true;
        } else {
            return false;
        }
    }
}
