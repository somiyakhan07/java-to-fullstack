// Q4 — Marks Validation
// ============================================================
//
// Create a method that accepts a student's marks.
//
// Requirements:
// - Use throw to throw an IllegalArgumentException if marks
//   are below 0 or above 100.
// - Accept marks from 0 to 100 as valid.
// - Print the result for valid marks.
// - Handle the exception using try-catch.
//
// Goal:
// Validate a numeric range using throw.

public class MarkValidation {

    public void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            // Throw an exception if marks are outside 0–100.
            throw new IllegalArgumentException("Invalid Marks");
        } else {
            // Print marks only when they are valid.
            System.out.println("Valid Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        MarkValidation m1 = new MarkValidation();

        try {
            m1.validateMarks(850);
        } catch (IllegalArgumentException e) {
            // Catch the exception and print its message.
            System.out.println(e.getMessage());
        }
    }
}

// Invalid Marks