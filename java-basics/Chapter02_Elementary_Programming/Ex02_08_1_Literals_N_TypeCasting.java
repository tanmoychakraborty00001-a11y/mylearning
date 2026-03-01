public class Ex02_08_1_Literals_N_TypeCasting{

    public static void main(String[] args){
        // 1. BINARY LITERAL (0b): Digital Switches
        // Each bit represents a room: [Kitchen][Bed][Bath][Living]
        // 0b1011 means Kitchen is ON, Bed is OFF, Bath is ON, Living is ON
        int roomSwitches = 0b1011;

        // 2. HEXADECIMAL LITERAL (0X): Hardware ID
        // Device IDs are often stored Hex for memory efficiency
        int deviceId = 0x7E;

        // 3. DECIMAL lITERALS: Human units
        int volts = 230;
        double amps = 4.55;


        // --- TYPE CONVERSION STARTS HERE ---

        // 4. IMPLICIT PROMOTION STARTS (int -> double)
        // CPU promotes 'volts' to 230.0 multiply with 'amps'
        double watts = volts * amps;

        // 5. EXPLICIT CASTING (double -> int) - NARROWING
        // We want the whole number for a simple display
        // We are telling CPU: "Throw away the decimal bits!"
        int roundedwatts = (int) watts;

        // 6. STRING CONVERSION (FORMATTING)
        // Converting the internal bits into a human-readable String
        String status = Integer.toBinaryString(roomSwitches);

        // --- OUTPUT ---
        System.out.println("Device ID: " + deviceId);
        System.out.println("Room Status (Binary): " + status);
        System.out.println("Exact Consumption: " + watts + " W");
        System.out.println("Rounded Consumption: " + roundedwatts + " W");
    }
}