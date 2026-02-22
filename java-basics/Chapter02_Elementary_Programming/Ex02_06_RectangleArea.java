import java.util.Scanner;
// If public class Main {}, file name should be Main.java, otherwise remove public class Main
class Main {

    public static void main(String[] args) {
        
        double width = 0;
        double height = 0;
        double area = 0;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area);
        
        scanner.close();
    }

}