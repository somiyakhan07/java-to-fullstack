// Q9 — Enum with Fields and Method
// ============================================================
//
// Create an enum PizzaSize with:
// - SMALL → 100
// - MEDIUM → 200
// - LARGE → 300
//
// Store the price for each constant.
//
// Add a method getPrice() that returns the price.
//
// In main():
// - Print the price of MEDIUM.
//
// Goal:
// Practice enum constants with fields,
// constructors, and methods together.

// Enum with constants and fields
enum PizzaSize {

    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    // Field to store the price
    private int price;

    // Constructor stores the price of each enum constant
    private PizzaSize(int price) {
        this.price = price;
    }

    // Returns the price of the current enum constant
    public int getPrice() {
        return price;
    }
}

public class EnumFieldsAndMethods {

    public static void main(String[] args) {

        // Access MEDIUM and get its stored price
        System.out.println(PizzaSize.MEDIUM.getPrice());
    }
}

// Output:
// 200

/*
 * Important:
 * Enum can have:
 * - Fields
 * - Constructors
 * - Methods
 */