public class BarkingDog {
    public static void main(String[] args) {

        boolean barking = true;
        int hourOfDay = 9;

        shouldWakeUp(barking, hourOfDay);

        System.out.println(shouldWakeUp(barking, hourOfDay));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if ((barking) && (hourOfDay < 8) || (hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
