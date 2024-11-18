public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(707));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int i = number;
        while (i != 0 || i > 0) {
            lastDigit = i % 10;
            reverse = (reverse * 10 ) + lastDigit;
            i = i / 10;
        }
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
