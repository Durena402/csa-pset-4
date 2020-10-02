import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length       : ");
        double length = input.nextDouble();

        System.out.print("Width        : ");
        double width = input.nextDouble();

        System.out.print("Diameter     : ");
        double diameter = input.nextDouble();

        double boardArea = length * width;
        double radius = diameter / 2;
        double circleArea = Math.PI * Math.pow(radius, 2);
        double finalArea = boardArea - circleArea;

        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println("\nSurface area : " + df2.format(finalArea));
    }
}
