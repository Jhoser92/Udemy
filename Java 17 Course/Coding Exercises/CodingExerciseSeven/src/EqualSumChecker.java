public class EqualSumChecker {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        System.out.println(hasEqualSum(num1, num2, num3));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        int totalSum = num1 + num2;

        if (totalSum == num3) {
            return true;
        } else {
            return false;
        }
    }
}
