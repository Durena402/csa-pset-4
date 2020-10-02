import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Side      : ");
        double side = input.nextDouble();

        double perimeter = side * 6;

        double area = 6 *(Math.sqrt(3) / 4) * Math.pow(side, 2);

        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println(("\nArea      : " + df2.format(area)));
        System.out.println("Perimeter : " + df2.format(perimeter));
    }
}
