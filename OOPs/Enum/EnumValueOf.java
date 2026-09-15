/*
 * Q4 — valueOf()
 *
 * Create an enum Status:
 * PENDING, SUCCESS, FAILED
 *
 * Take this String:
 * String input = "SUCCESS";
 *
 * Use valueOf() to convert it into a Status and print it.
 */

enum Status {

    // Enum constants
    PENDING, SUCCESS, FAILED;
}

public class EnumValueOf {

    public static void main(String[] args) {

        // Store the enum value as a String
        String input = "SUCCESS";

        // Convert the String into a Status enum constant
        Status s = Status.valueOf(input);

        // Print the converted enum value
        System.out.println(s);
    }
}

// Output:
// SUCCESS

/*
 * Explanation:
 * valueOf() converts a String into its matching enum constant.
 *
 * "SUCCESS" -> Status.SUCCESS
 * "SUCCESS" -> Status.SUCCESS
 *
 * The String must exactly match the enum constant name.
 */