package ie.atu.ie.atu.week5;
import java.util.Scanner;
public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("PLease enter the length of the Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered : " + length);

        System.out.println("PLease enter the width of the Rectangle");
        double width = input.nextDouble();
        System.out.println("You entered : " + width);
    }
}
