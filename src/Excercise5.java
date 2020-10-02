import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Diameter      : ");
        double diameter = input.nextDouble();

        double radius = diameter / 2;

        double area = Math.PI * Math.pow(radius, 2);

        double circum = 2 * Math.PI * radius;
        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println("\nArea          : " + df2.format(area));
        System.out.println("Circumference : "+df2.format(circum));

        input.close();
    }
}
