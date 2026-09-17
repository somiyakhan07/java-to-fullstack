// Q7 — Enum with Fields
// ============================================================
//
// Create an enum Level with:
// - LOW
// - MEDIUM
// - HIGH
//
// Add an int value to each constant:
// - LOW → 1
// - MEDIUM → 2
// - HIGH → 3
//
// Add a constructor and a field to store the value.
//
// In main():
// - Print the value of HIGH.
//
// Goal:
// Understand how enum constants can have their own data.

enum Level {

    // Each enum constant has its own value
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    // Field to store the value
    private int value;

    // Constructor stores the value in the field
    private Level(int value) {
        this.value = value;
    }

    // Getter to access the private field
    public int getValue() {
        return value;
    }
}

public class EnumFields {

    public static void main(String[] args) {

        // Access HIGH enum constant
        // and get its stored value
        System.out.println(Level.HIGH.getValue());
    }
}

// Output:
// 3

/*
 * Explanation:
 * LOW, MEDIUM and HIGH are enum constants.
 *
 * Each constant has its own value:
 * LOW -> 1
 * MEDIUM -> 2
 * HIGH -> 3
 *
 * The constructor stores the value in the field.
 *
 * getValue() is used to access the private field.
 *
 * Important:
 * values() -> returns all enum constants.
 * getValue() -> returns the value stored in one constant.
 */