/*Consisting of Input (Scanner), Variables, Data types (int, double), Simple Calculations, Basic output (println, printf) for all exercises*/
/*1. Converting Celsius to Fahrenheit*/
import java.util.Scanner;
public class Ex02_01{
    public static void main(String[] args) {
        // Declare variables
        double celsius;
        double fahrenheit;
        // Prompting the user to enter the temperature in Celsius
        System.out.print("Enter a degree in Celsius: ");
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Assign the input to read the Celsius temperature as a double
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula:
        // fahrenheit = (9.0 / 5) * celsius + 32
        fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println("The converted temperature in Fahrenheit from Celsius: " + celsius + " is " + fahrenheit);

        // Close the scanner
        input.close();
    }

}