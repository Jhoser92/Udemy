public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord(3);
    }

    public static void printNumberInWord(int number) {

        String numberWord = switch (number) {
            case 0 -> { yield "ZERO"; }
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "Three";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "Other";
        };
        System.out.println(numberWord);
    }
}
