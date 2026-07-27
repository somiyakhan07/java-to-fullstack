// Design a simple Online Shopping Cart.
// A customer should be able to add or remove product quantity from the cart. 
// The cart should also be able to calculate the total price based on the product price and quantity.

class Customer { // create class
    private String name; // private variable
    private int quantity;
    private int productPrice;

    public Customer(String name, int quantity, int productPrice) {
        this.name = name;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public String getName() { // fetch name
        return name; 
    }

    public void setName(String name) { // set name in private name variable
        this.name = name;
    }
  
    public int getQuantity() { // fetch quantity value
        return quantity;
    }

    public void setQuantity(int quantity) { // set quantity value in private variable
        this.quantity = quantity;
    }

    public void addQuantity(int add) { // add product with validation
        if (add > 0) {
            quantity = quantity + add;
            System.out.println("added Product: " + add);
        } else {
            System.out.println("Invalid request");
        }
    }

    public void removeQuantity(int remove) { // remove product with validation
        if (remove > 0 && remove <= quantity) {
            quantity = quantity - remove;
            System.out.println("Removed Product: " + remove);
        } else {
            System.out.println("invalid request");
        }

    }

    public void price() { // calculate total price
        double totalPrice = productPrice * quantity;
        System.out.println("Price: " + totalPrice);
    }
}

public class OnlineShoppingCart { // main class
    public static void main(String[] args) { // main method
        Customer c1 = new Customer("Flower pot", 1, 100); // create class obj c1 and hardcoded value
        System.out.println("product name: " + c1.getName()); // display name
        System.out.println("Total Quantity: " + c1.getQuantity()); // display quantity
        c1.price(); // calculate and display total price
        System.out.println();

        c1.addQuantity(4); // add quantity of product
        System.out.println("Total Quantity: " + c1.getQuantity()); // display total quantity
        c1.price(); // calculate and display total price
        System.out.println();

        c1.removeQuantity(2); // remove quantity of product
        System.out.println("Total Quantity: " + c1.getQuantity()); // display total quantity
        c1.price(); // calculate and display total price
    }
}
/*output:
product name: Flower pot
Total Quantity: 1
Price: 100

added Product: 4
Total Quantity: 5
Price: 500

Removed Product: 2
Total Quantity: 3
Price: 300
 */