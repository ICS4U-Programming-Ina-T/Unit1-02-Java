import java.util.Scanner;

/**
 * The EinsteinEquation program implements an application that
 * calculates the amount of energy released from an object.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-2-22
 */

class EinsteinEquation {
    /**
     * Declaring constant.
     */
    private static final double SPEED_OF_LIGHT = 2.998 * Math.pow(10, 8);
    /**
     * Declaring constant.
     */
    private static final double KILO_IN_JOULE = 2.390057361 * Math.pow(10, -13);

    /**
     * Main entry point into program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // display opening message
        System.out.println("Today I will tell you the "
                           + "amount of energy released from an object.");
        // blank line
        System.out.println();
        // creates scanner
        final Scanner sc = new Scanner(System.in);
        // gets input from the user
        System.out.println("Enter the mass of an object (kg): ");
        final String massString = sc.nextLine();
        // blank line
        System.out.println();
        try {
            // converts string input to a double
            final double massDouble = Double.parseDouble(massString);
            // checks if value is negative
            if (massDouble >= 0) {
                // calculates energy
                final double energy = massDouble
                                    * (Math.pow(SPEED_OF_LIGHT, 2));
                // calculates amount of kiloton bombs
                final double kiloton = energy * KILO_IN_JOULE;
                // displays results to the user
                System.out.println(massDouble + "kg of mass would produce "
                                   + energy + "J of energy.");
                System.out.println("Roughly " + kiloton + " kiloton bombs are "
                                   + "equal to this amount of energy "
                                   + "in Joules.");
            } else {
                // catches negative values
                System.out.println("Objects must have a mass greater than 0.");
            }
        } catch (IllegalArgumentException exception) {
            // catches invalid strings
            System.out.println("Invalid entry!");
        }
    }
}
