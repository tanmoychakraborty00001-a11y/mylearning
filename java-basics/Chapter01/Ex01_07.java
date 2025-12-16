/* This is multi line comment - using double variable */
public class Ex01_07 {
    public static void main(String[] args) {
        double unit_price = 19.99;
        double quantity = 2.5;
        System.out.println("unit_price = " + unit_price + " and quantity = " + quantity);
        double total_price = unit_price * quantity;
        System.out.printf("Total Price = %.2f%n", total_price);
    }
}