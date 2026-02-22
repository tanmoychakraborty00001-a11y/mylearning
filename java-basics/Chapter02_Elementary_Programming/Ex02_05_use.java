import java.util.Scanner;

public class Ex02_05_use {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking inputs through scanner object and Declare variables

        // Promt user for input
        System.out.println("Enter the RPM of the Motor: ");
        int RPM = scanner.nextInt();

        double BrakeTorque = 975 * HoistMotorKW.MechPowerKW / RPM;

        System.out.println(String.format("The Brake Torque is: %.2f", BrakeTorque));

        // Close the scanner
        scanner.close();
    

        
    }

}