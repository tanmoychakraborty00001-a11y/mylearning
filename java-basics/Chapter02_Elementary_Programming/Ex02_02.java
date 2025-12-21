
/*Consisting of Input (Scanner), Variables, Data types (int, double), Simple Calculations, Basic output (println, printf) for all exercises*/
/*2. Calculating the area and volume of a cylinder*/
import java.util.Scanner;

public class Ex02_02 {

    public static void main(String[] args) {
        // Declare variables
        double radius;
        double length;
        double area;
        double volume;

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the cylinder: ");
        // Assign the input to read the radius as a double
        radius = input.nextDouble();

        // Prompt the user to enter the length
        System.out.print("Enter the length of the cylinder: ");
        // Assign the input to read the length as a double
        length = input.nextDouble();

        // Calculate the area
        area = radius * radius * Math.PI;

        // Calculate the volume
        volume = area * length;

        // Display the results
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        input.close();
    }

}