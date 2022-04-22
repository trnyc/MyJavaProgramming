package week03;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, num3, num4, total;

        System.out.println("Enter four numbers");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        num4 = scan.nextDouble();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        total = num1 + num2 +num3 + num4;

        System.out.println("total = " + total);

    }
}
