/*/*Consisting of Input (Scanner), Variables, Data types (int, double), Simple Calculations, Basic output (println, printf) for all exercises*/
/*1. Calculating gratuity and total amount*/
import java.util.Scanner;

public class Ex02_03 {
    public static void main(String[] args) {
        int years;
        int months;
        int gratuityYears;
        double lastSalary;
        double gratuity;
        double total;
        System.out.println("Enter the number of years: ");
        System.out.println("Enter the number of months: ");
        Scanner input = new Scanner(System.in);
        years = input.nextInt();
        months = input.nextInt();
        System.out.println("Enter the last salary: ");
        lastSalary = input.nextDouble();

        if (months > 6) {
            gratuityYears = years + 1;
        } else {
            gratuityYears = years;
        }
        System.out.println("The gratuity is: " + gratuityYears);
        gratuity = lastSalary * 15/26 * gratuityYears;
        System.out.printf("The Total Gratuity is: %.2f", gratuity);
        input.close();
    


    }
}