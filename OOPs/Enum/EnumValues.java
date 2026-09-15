/*
 * Q2 — values()
 *
 * Create an enum Direction:
 * NORTH, SOUTH, EAST, WEST
 *
 * Use values() to print all directions using a loop.
 */

enum Direction {

    // Enum constants
    NORTH, SOUTH, EAST, WEST;
}

public class EnumValues {

    public static void main(String[] args) {

        // values() returns all enum constants
        // The for each loop prints each constant one by one
        for (Direction d : Direction.values()) {

            // Print the current enum constant
            System.out.println(d);
        }
    }
}

/*
 * Output:
 * NORTH
 * SOUTH
 * EAST
 * WEST
 *
 * Explanation:
 * Direction.values() gives all constants of the Direction enum.
 * The for-each loop goes through each constant one by one.
 */