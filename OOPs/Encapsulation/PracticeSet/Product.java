// product - name, price and price should be greater than 0

class ProductName { // product name class
    private String name; //private variable
    private int price;

    public ProductName() { // default constractor with initialize value
        name = "Not Decided";
        price = 0;
    }

    public ProductName(String name, int price) { // parameterized constructor with product price validation
        this.name = name;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public String getName() { // fetch product name
        return name;
    }

    public void setName(String name) { // set product name in private variable
        this.name = name;
    }

    public int getPrice() { // fetch product price
        return price;
    }

    public void setPrice(int price) { // set product price in private variable with price validation
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }

    }
}

public class Product { // main class
    public static void main(String[] args) { // main method
        ProductName p1 = new ProductName(); // create object p1
        p1.setName("Frooti"); // set product name hardcoded
        p1.setPrice(15); // set product price hardcoded

        System.out.println("Product Name: " + p1.getName()); // display product name
        System.out.println("Price: " + p1.getPrice()); // display product price
    }

}
/*output:
Product Name: Frooti
Price: 15
 */