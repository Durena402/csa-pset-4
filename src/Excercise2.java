import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inches : ");
        double inch = input.nextDouble();

        int miles = (int) (inch / 63360);
        inch -= miles * 63360;

        int feet = (int) (inch / 12);
        inch -= feet * 12;

        int inches = (int) (inch);

        System.out.println("\nMiles  : " + miles);
        System.out.println("Feet   : " + feet);
        System.out.println("Inches : " + inches);

        input.close();
    }
}
