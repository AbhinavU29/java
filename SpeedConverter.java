public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(2.0);
        printConversion(2.0);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long a;
        if (kilometersPerHour < 0) {
            return -1;

        } else {
            long milesperhour = (long) (kilometersPerHour * 0.621371d);
            System.out.println(Math.round(milesperhour));
            a = Math.round(milesperhour);

        }
        return a;

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            //a=0;
        } else {
            double milesperhour = (kilometersPerHour/ 1.60934);
            System.out.println(Math.ceil(kilometersPerHour * 100.0) / 100.0 + " km/h = " + Math.round(milesperhour) + " mi/h");

        }
    }
}