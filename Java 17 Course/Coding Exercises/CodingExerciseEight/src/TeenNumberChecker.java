public class TeenNumberChecker {

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 15;
        int num3 = 16;

        System.out.println(hasTeen(num1, num2, num3));
        System.out.println(isTeen(num1));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        } else {
            return  false;
        }
    }

    public static boolean isTeen(int number) {
        if ((number > 12) && (number < 20)) {
            return true;
        } else {
            return false;
        }
    }
}
