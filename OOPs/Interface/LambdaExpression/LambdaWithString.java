// Q7 — Lambda with String
// ============================================================
//
// Create a functional interface StringOperation with:
// String operate(String text);
//
// Use a lambda expression to convert a String to uppercase.
//
// Example:
// Input: java
// Output: JAVA
//
// Goal:
// Practice lambda expressions with String values.

@FunctionalInterface
interface StringOperation {
    String operate(String text);
}

public class LambdaWithString {
    public static void main(String[] args) {

        // Lambda converts the given String to uppercase
        StringOperation s = (text) -> text.toUpperCase();

        String newText = s.operate("java");
        System.out.println(newText);
    }
}

// Output:
// JAVA