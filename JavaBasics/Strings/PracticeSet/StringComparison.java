// Demonstrates different ways to compare strings in Java.

public class StringComparison {
    public static void main(String[] args) {
        String prog1 = "Java";
        String prog2 = "Java";
        String prog3 = new String("Java"); // stroes in heap memory
        String prog4 = "java";

        // == compare object refernce (memory address)
        System.out.println("prog1 == prog2: " + (prog1 == prog2));
        System.out.println("prog1 == prog3: " + (prog1 == prog3));
        System.out.println();

        // equals() compares the actual content of the strings.
        System.out.println("prog2.equals(prog3): " + prog1.equals(prog3));
        System.out.println();

        // equalsIgnoreCase() compares content without considering letter case.
        System.out.println("prog3.equalsIgnoreCase(prog4): " + prog3.equalsIgnoreCase(prog4));
        System.out.println();

        // compareTo() compares two strings alphabetically.
        //
        // Returns:
        // Positive -> first string comes after second string.
        // Negative -> first string comes before second string.
        // Zero     -> both strings are equal.
        //
        // It compares the first different character using ASCII/Unicode values.
        System.out.println("prog1.compareTo(Python): " + prog1.compareTo("Python"));

    }

}
/*
O/P:
prog1 == prog2: true
prog1 == prog3: false

prog2.equals(prog3): true

prog3.equalsIgnoreCase(prog4): true

prog1.compareTo(Python): -6
 */