public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(168775623));
    }
    public static int getEvenDigitSum(int number) {

        int digit;
        int sum = 0;

        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            digit = number % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            number = number / 10;
        }
        return sum;
    }
}
