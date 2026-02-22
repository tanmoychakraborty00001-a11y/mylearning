import java.util.Scanner;

public class Ex02_05_userinput {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking inputs through scanner object and Declare variables

        // Promt user for input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary if > 25000: ");
        double salary = scanner.nextDouble();

        System.out.println("Are you employee? (True/False: ");
        boolean isEmployee = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old.");
        System.out.println("Your salary is: " + salary);

        if (isEmployee){
            System.out.println("You are eligible for Loan.");

        }
        else{
            System.out.println("You are not eligible for loan.");
        }

        // Close the scanner
        scanner.close();
    

        
    }

}