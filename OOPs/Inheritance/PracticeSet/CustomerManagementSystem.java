// Design a Customer Management System.
// Every Customer is a User.
// Store common user information in the parent class
// and customer-related information in the child class.
// Display all the details through the child object.

import java.util.Scanner;

// Parent class - stores common User information
class UserInformation {
    private String name;
    private int age;

    // Parameterized constructor to initialize user information
    public UserInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter to fetch user's name
    public String getName() {
        return name;
    }

    // Setter to update user's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter to fetch user's age
    public int getAge() {
        return age;
    }

    // Setter to update user's age
    public void setAge(int age) {
        this.age = age;
    }
}

// Child class - stores Customer-specific information
class CustomerInfo extends UserInformation {
    private String productName;
    private double price;
    private double discount;

    // Parameterized constructor
    // super() calls the parent class constructor
    public CustomerInfo(String name, int age, String productName, double price) {
        super(name, age);

        this.productName = productName;
        this.price = price;
    }

    // Getter to fetch product name
    public String getProductName() {
        return productName;
    }

    // Setter to update product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter to fetch product price
    public double getPrice() {
        return price;
    }

    // Setter to update product price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter to fetch discount amount
    public double getDiscount() {
        return discount;
    }

    // Method to apply discount with validation
    public void applyDiscount(double percentage) {

        // Discount is allowed only between 5% and 20%
        if (percentage >= 5 && percentage <= 20) {

            double discountPercentage = percentage / 100;

            // Calculate discount amount
            discount = price * discountPercentage;

            // Subtract discount from original price
            price = price - discount;

            System.out.println("Discount applied successfully!");

        } else {
            System.out.println("Invalid discount! Enter between 5% and 20%.");
        }
    }
}

// Main class
public class CustomerManagementSystem {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take customer name
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        // Take customer age
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Take product name
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        // Take product price
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        // Create Customer object
        // Parent information + child information
        CustomerInfo c1 = new CustomerInfo(name, age, productName, price);

        // Display customer and product information
        System.out.println("\n--- Customer Details ---");
        System.out.println("Name: " + c1.getName());
        System.out.println("Age: " + c1.getAge());
        System.out.println("Product Name: " + c1.getProductName());
        System.out.println("Product Price: " + c1.getPrice());

        // Take discount percentage
        System.out.print("\nApply Discount Percentage: ");
        double discount = sc.nextDouble();

        // Apply discount through controlled method
        c1.applyDiscount(discount);

        // Display final price
        System.out.println("Final Price After Discount: " + c1.getPrice());

        // Close Scanner
        sc.close();
    }
}

/*output:
Enter Your Name: Aliya
Enter Your Age: 20
Enter Product Name: Mobile
Enter Product Price: 20000

--- Customer Details ---
Name: Aliya
Age: 20
Product Name: Mobile
Product Price: 20000.0

Apply Discount Percentage: 10
Discount applied successfully!
Final Price After Discount: 18000.0 */