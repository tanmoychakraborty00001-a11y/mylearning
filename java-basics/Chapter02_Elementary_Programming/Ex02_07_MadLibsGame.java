import java.util.Scanner;

public class Ex02_07_MadLibsGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Mad Libs Game!");

        // Prompt user for various parts of speech
        System.out.println("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter a verb (past tense): ");
        String verb1 = scanner.nextLine();

        System.out.println("Enter a verb (present tense): ");
        String verb2 = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        // Display the Mad Libs story
        System.out.println("\n--- This is my awesome Mad Libs Story ---");
        System.out.printf("Today I started the programming in %s. It's just %s . I just %s it.%n", noun1, adjective1, verb1);
        System.out.printf("It %s %s towards me.%n", verb2, adverb);
        System.out.printf("I felt very %s about the whole situation!%n", adjective2);

        // Close the scanner
        scanner.close();
    }

}