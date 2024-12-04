public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("The total sum of the first and last digit is " + sumFirstAndLastDigit(3556));
    }

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit;
        int lastDigit;
        int sumDigit;

        if (number < 0) {
            return -1;
        }

        lastDigit = number % 10;
        firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        System.out.println("First digit is " + firstDigit);
        System.out.println("Last digit is " + lastDigit);

        sumDigit = firstDigit + lastDigit;

        return sumDigit;
    }
}
