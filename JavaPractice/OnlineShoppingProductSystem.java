// Q8 — Online Shopping Product System
// ============================================================
//
// Create:
//
// Product
//    ↑
// Electronics
// Clothing
//
// Use:
// - Inheritance
// - Encapsulation
// - Constructor
// - Method Overriding
// - Polymorphism
// - Interface
// - Enum
// - Array of Objects

interface items {

    public void itemsDetails();
}

class Product implements items {
    // enum name and it's method name
    private OrderStatus orderStatus;

    public Product(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void itemsDetails() {
        System.out.println("in Products");
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}

class Electronics extends Product {
    private String electronics;
    private int price;

    public Electronics(String electronics, int price, OrderStatus orderStatus) {
        super(orderStatus);
        this.electronics = electronics;
        this.price = price;

    }

    public String getElectronics() {
        return electronics;
    }

    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void itemsDetails() {
        System.out.println("Electronic Item: " + electronics);
        System.out.println("Price: " + price);
    }

}

class Clothing extends Product {
    private String brand;
    private int price;

    public Clothing(String brand, int price, OrderStatus orderStatus) {
        super(orderStatus);
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void itemsDetails() {
        System.out.println("Brand Name: " + brand);
        System.out.println("Price: " + price);
    }

}

enum OrderStatus {
    ORDERED,
    PLACED,
    DELIVERED,
    CANCELLED;

    // Displays a message according to the current order status
    public void orderStatus() {
        if (this == PLACED) {
            System.out.println("Order Placed Successfully");
        } else if (this == ORDERED) {
            System.out.println("Order Booked");
        } else if (this == DELIVERED) {
            System.out.println("Delivery Done!");
        } else {
            System.out.println("Your Order is Cancelled");
        }

    }
}

public class OnlineShoppingProductSystem {
    public static void main(String[] args) {

        // Polymorphism: parent reference holding child objects
        Product p1 = new Electronics("Phone", 50000, OrderStatus.ORDERED);
        Product p2 = new Clothing("Gucci", 100000, OrderStatus.PLACED);

        p1.itemsDetails();
        p1.getOrderStatus().orderStatus();

        System.out.println();

        p2.itemsDetails();
        p2.getOrderStatus().orderStatus();

        System.out.println();

        // Array of Product objects
        Product[] products = new Product[2];

        products[0] = new Electronics("Mic", 500, OrderStatus.DELIVERED);
        products[1] = new Clothing("Normal", 200, OrderStatus.ORDERED);

        products[0].itemsDetails();
        products[0].getOrderStatus().orderStatus();

        System.out.println();

        products[1].itemsDetails();
        products[1].getOrderStatus().orderStatus();
    }

}