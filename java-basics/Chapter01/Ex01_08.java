/*Area and perimeter of a cylinder */
public class Ex01_08 {
    public static void main(String[] args) {
        double radius = 5.5;
        double height = 12;

        double area = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The perimeter is %.2f\n", perimeter);
    }
}
