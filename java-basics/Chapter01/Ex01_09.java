/*Area and perimeter of a rhombus */
public class Ex01_09 {
    public static void main(String[] args) {
        double side = 5.5;
        double diagonal1 = 8;
        double diagonal2 = 6;

        double area = (diagonal1 * diagonal2) / 2;
        double perimeter = 4 * side;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The perimeter is %.2f\n", perimeter);
    }
}