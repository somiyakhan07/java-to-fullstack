// Q10 — Enum Object and Method Challenge
// ============================================================
//
// Create an enum Day with all 7 days.
//
// Add a method isWeekend() that returns:
// - true for SATURDAY and SUNDAY
// - false for all other days
//
// In main():
// - Store SATURDAY in a Day variable.
// - Call isWeekend().
// - Print the result.
//
// Expected output:
// true
//
// Goal:
// Understand how enum methods can contain logic
// and return values.

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Returns true for Saturday/Sunday
    // and false for all other days
    public boolean isWeekend() {

        switch (this) {
            case SATURDAY:
            case SUNDAY:
                return true;

            default:
                return false;
        }
    }
}

public class EnumObjectsAndMethods {

    public static void main(String[] args) {

        // Store SATURDAY in a Day variable and Type is Day that stores enum constant
        Day day = Day.SATURDAY;

        // Call the method and print the returned boolean value
        System.out.println(day.isWeekend());
    }
}

// Output:
// true

/*
 * Important:
 * Method return type = boolean
 * return true / false = sends the result back
 */