/*
 * Enum + Switch Challenge
 *
 * Create an enum:
 * MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
 * FRIDAY, SATURDAY, SUNDAY
 *
 * Store any day in a variable and use switch to print whether it is:
 *
 * Weekday
 * or
 * Weekend
 */

enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY, SUNDAY;
}

public class EnumSwitch {

    public static void main(String[] args) {

        // Store a day in the enum variable
        Weekday s = Weekday.MONDAY;

        switch (s) {

            // Monday to Friday are weekdays
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Weekday");
                break;

            // Saturday and Sunday are weekends
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
        }
    }
}

// Output:
// Weekday

/*
 * Explanation:
 * switch checks which enum constant is stored in s.
 *
 * Multiple cases can be grouped when they have the same output.
 */