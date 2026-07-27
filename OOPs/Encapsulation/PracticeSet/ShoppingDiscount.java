// Design a Shopping Discount system.
// A customer should be able to apply a discount to a purchase. 
// The discount should be within an acceptable range, and the system should calculate the final price after applying the discount.

class Customer { // create class
    private String name; // private variables
    private String item;
    private double purchase;

    public Customer(){ //
        name = "Customer name";
        item = "Product name";
        purchase = 0;
    }

    public Customer(String name, String item, double purchase) { // parameterized constructor
        this.name = name;
        this.item = item;
        this.purchase = purchase;
    }

    public String getName() { // fetch name
        return name;
    }

    public void setName(String name) { // set name in private name variable
        this.name = name;
    }

    public String getItem() { // fetch item name
        return item;
    }

    public void setItem(String item) { // sit item name in private item variable 
        this.item = item;
    }

    public double getPurchase() { // fetch purchase value
        return purchase;
    }

    public void setPurchase(double purchase) { // set purchase value in private purchase variable
        this.purchase = purchase;
    }

    public void applyDiscount(double percentage) { // calcuate discount price and update in purchase with percentage validation
        if (percentage >= 0 && percentage <= 25) { // Discount allowed between 0% and 25%
            percentage = percentage / 100;
            double discountPrice = purchase * percentage;
            purchase = purchase - discountPrice;
        } else {
            System.out.println("Invalid Discount");
        }
    }
}

public class ShoppingDiscount { // main class
    public static void main(String[] args) { // main method
        Customer c1 = new Customer("Veer", "Flower pot", 2000); // create class obj c1
        System.out.println("Name: " + c1.getName()); // display customer name
        System.out.println("Item: " + c1.getItem()); // display item name
        System.out.println("Purchase price: " + c1.getPurchase()); // display actual price
        c1.applyDiscount(10); // update discount percentage
        System.out.println("Discount price: " + c1.getPurchase()); // display discount price

    }

}
/* output:
Name: Veer
Item: Flower pot
Purchase price: 2000.0
Discount price: 1800.0
 */