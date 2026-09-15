// Q6 — Enum Constructor

enum Laptop {

    // Each enum constant can have its own price
    Macbook(2000),
    XPS(2200),
    Surface,
    Thinkpad(1800);

    private int price;

    // Constructor with price
    private Laptop(int price) {
        this.price = price;

        // name() returns the current enum constant name
        System.out.println("in Laptop " + this.name());
    }

    // Returns the price
    public int getPrice() {
        return price;
    }

    // Changes the price
    public void setPrice(int price) {
        this.price = price;
    }

    // No-argument constructor
    // Used by Surface because no price is given
    private Laptop() {
        price = 500;
    }
}

public class EnumConstructor {

    public static void main(String[] args) {

        // values() returns all enum constants
        for (Laptop lap : Laptop.values()) {

            // Print enum constant and its price
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}

/*
 * Explanation:
 * Enum constants can have their own data.
 *
 * Macbook(2000) calls the constructor with price.
 * XPS(2200) calls the constructor with price.
 * Thinkpad(1800) calls the constructor with price.
 *
 * Surface has no price, so the no-argument constructor
 * sets its price to 500.
 *
 * Enum constructors are called automatically when
 * the enum constants are initialized.
 */