/* Measuring amps through a circuit */
public class Ex01_11 {
    public static void main(String[] args) {
        double voltage = 12.0;
        double resistance = 4.0;

        double current = voltage / resistance;

        System.out.printf("The current is %.2f\n", current);
    }
}