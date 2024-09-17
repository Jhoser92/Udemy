public class LeapYear {

    public static void main(String[] args) {

        int year = 2017;

        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }
}
