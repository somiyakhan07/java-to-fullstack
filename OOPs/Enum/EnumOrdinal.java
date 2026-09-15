/*
 * Q3 — ordinal()
 *
 * Create an enum Size:
 *
 * SMALL, MEDIUM, LARGE, EXTRA_LARGE
 *
 * Print the ordinal value of each constant.
 *
 * Expected positions:
 * SMALL → 0
 * MEDIUM → 1
 * LARGE → 2
 * EXTRA_LARGE → 3
 */

enum Size {

    // Enum constants
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
}

public class EnumOrdinal {

    public static void main(String[] args) {

        // values() returns all enum constants as an array
        Size[] ss = Size.values();

        // Go through each enum constant one by one
        for (Size s : ss) {

            // ordinal() returns the position of the enum constant
            System.out.println(s + " : " + s.ordinal());
        }
    }
}

/*
 * Output:
 * SMALL : 0
 * MEDIUM : 1
 * LARGE : 2
 * EXTRA_LARGE : 3
 *
 * Explanation:
 * ordinal() returns the position of an enum constant.
 * The position starts from 0.
 *
 * Important:
 * ordinal() is based on the order in which constants are declared in the enum.
 */