/*
 * Q1 — Basic Enum
 *
 * Create an enum Day containing all 7 days of the week.
 *
 * In main():
 * - Store MONDAY in a variable.
 * - Print it.
 */

enum Day {

    // Enum constants
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class BasicEnum {

    public static void main(String[] args) {

        // Store the MONDAY enum constant in a variable
        Day d = Day.MONDAY;

        // Print the enum value
        System.out.println(d);
    }
}

// Output:
// MONDAY

/*
 * Explanation:
 * Enum is used to represent a fixed set of constants.
 * 
 * here, Day contains only the 7 days of the week.
 *
 * Day.MONDAY means MONDAY constant from the Day enum.
 */