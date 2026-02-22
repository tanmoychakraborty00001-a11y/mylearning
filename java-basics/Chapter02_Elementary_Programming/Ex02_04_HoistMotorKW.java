// Calculating Hoisting Motor Power

// Importing scanner class from util package to read the user input
import java.util.Scanner;

public class Ex02_04_HoistMotorKW {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking inputs through object and Declare variables

        // Prompt user for input
        System.out.println("Enter the mass (M) to be lifted (in Ton): ");
        double M = scanner.nextDouble();

        System.out.println("Enter the hoisting speed (V) (in m/min): ");
        double V = scanner.nextDouble();

        System.out.println("Enter the number of gear pairs (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of rotating sheaves at each part from CL (m): ");
        int m = scanner.nextInt();

        System.out.println("Enter the service factor (S): ");
        double S = scanner.nextDouble();

        // Efficiency for hardened profile gear and splashed lubrication per stage = 0.985
        // Efficiency for sheaves = 0.99
        // Combined Efficiency E = 0.985^n * 0.99^m
        
        double E = Math.pow(0.985, n) * Math.pow(0.99, m);

        double MechPowerKW = M * V / (6.12 * E);

        double ElecPowerKW = M * V * S / (6.12 * E);

        System.out.println(String.format("The combined Efficiency is: %.2f", E));

        System.out.println(String.format("The Motor Mechanical KW is: %.2f", MechPowerKW));

        System.out.println(String.format("The Motor Electrical KW is: %.2f", ElecPowerKW));

        // Close the scanner
        scanner.close();
    }

}