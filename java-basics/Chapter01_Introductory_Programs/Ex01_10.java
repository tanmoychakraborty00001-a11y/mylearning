/*Area and perimeter of a trapezoid */
public class Ex01_10 {
    public static void main(String[] args) {
        double base1 = 5.5;
        double base2 = 7.5;
        double height = 6.5;
        double side1 = 4.5;
        double side2 = 4.5;

        double area = (base1 + base2) * height / 2;
        double perimeter = base1 + base2 + side1 + side2;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The perimeter is %.2f\n", perimeter);
    }
}