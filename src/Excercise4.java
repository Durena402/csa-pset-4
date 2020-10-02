import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Centimeters : ");
        double centi = input.nextDouble();

        int kilo = (int) (centi / 100000);
        centi -= kilo * 100000;

        int meters = (int) (centi / 100);
        centi -= meters * 100;

        int centimeters = (int) (centi);

        System.out.println("\nKilometers  : "+ kilo);
        System.out.println("Meters      : " + meters);
        System.out.println("Centimeters : " + centimeters);
    }
}
