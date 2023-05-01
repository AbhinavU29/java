public class Main {
    public static void main(String[] args) {

        double kilometersPerHour = 1.25;
        long milesperhour =  Long.parseLong(kilometersPerHour * 0.621371d+"");
        System.out.println(milesperhour);
        System.out.println(Math.round(kilometersPerHour * 100.0) / 100.0 + " km/h = " + Math.round(milesperhour) + " mi/h");
// return 0;
    }
}