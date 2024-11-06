public class SumOddRange {

    public static void main(String[] args) {

        System.out.println(sumOdd(4,10));
        System.out.println(isOdd(35));
    }

    public static boolean isOdd(int number) {

        return (number > 0) && (number % 2 == 1);

    }

    public static int sumOdd(int start, int end) {

        if (start <= 0 || start > end) {
            return -1;

        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += isOdd(i) ? i : 0;

        }

        return sum;

    }
}
