package ie.atu.ie.atu.week5;
import java.util.Scanner;
public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("PLease enter the length of the Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        //created first instance of rectangle
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("You entered : " + shapeRect.getLength());


        System.out.println("PLease enter the width of the Rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered : " + shapeRect.getWidth());
        //created second instance of rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("PLease enter the second length of the Rectangle");
        double length2 = input.nextDouble();
        shapeRect.setLength(length2);
        System.out.println("You entered : " + shapeRect2.getLength());


        System.out.println("PLease enter the second width of the Rectangle");
        double width2 = input.nextDouble();
        shapeRect.setWidth(width2);


        Rectangle shapeRect3 = new Rectangle(23,67);
        System.out.println("You entered for length : " + shapeRect3.getLength());
        System.out.println("You entered for width: " + shapeRect3.getWidth());
    }
}
