// Q7 — Food Ordering System
// ============================================================
//
// Create a food ordering program.
//
// Use:
// - Class & Object
// - Encapsulation
// - Constructor
// - Methods
// - Enum
// - Array of Objects
//
// Create:
//
// enum OrderStatus {
//     PLACED,
//     PREPARING,
//     DELIVERED,
//     CANCELLED
// }
//
// Allow the order status to be displayed and updated.
//

class FoodOrder {
    private String foodName;
    private int price;
    private String orderId;
    private OrderStatus orderStatus;

    public FoodOrder(String foodName, int price, String orderId, OrderStatus orderStatus) {
        this.foodName = foodName;
        this.price = price;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Updates the current order status
    public void updateStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        System.out.println("Status Updated!");
    }

    // Displays complete order details
    public void displayOrder() {
        System.out.println("Food: " + foodName);
        System.out.println("Price: " + price);
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + orderStatus);

        // Display message according to the current status
        orderStatus.orderStatus();
    }
}

enum OrderStatus {
    PLACED,
    PREPARING,
    DELIVERED,
    CANCELLED;

    // Displays a message according to the current order status
    public void orderStatus() {
        if (this == PLACED) {
            System.out.println("Order Placed Successfully");
        } else if (this == PREPARING) {
            System.out.println("Food Getting Prepared");
        } else if (this == DELIVERED) {
            System.out.println("Food Delivery Done!");
        } else {
            System.out.println("Your Order is Cancelled");
        }
    }
}

public class FoodOrderingSystem {

    public static void main(String[] args) {

        // Array of FoodOrder objects
        FoodOrder[] food = new FoodOrder[3];

        food[0] = new FoodOrder(
                "Samosa", 20, "098", OrderStatus.PREPARING);

        food[1] = new FoodOrder(
                "Coke", 10, "099", OrderStatus.PLACED);

        food[2] = new FoodOrder(
                "Biryani", 200, "100", OrderStatus.PREPARING);

        food[0].displayOrder();
        food[0].updateStatus(OrderStatus.DELIVERED);
        food[0].displayOrder();
        System.out.println();

        food[1].displayOrder();
        food[1].updateStatus(OrderStatus.DELIVERED);
        food[1].displayOrder();
        System.out.println();
        
        food[2].displayOrder();
        food[2].updateStatus(OrderStatus.DELIVERED);
        food[2].displayOrder();
        System.out.println();
    }
}

/*
 * Output:
 * 
 * Food: Samosa
 * Price: 20
 * Order ID: 098
 * Status: PREPARING
 * Food Getting Prepared
 * Status Updated!
 * Food: Samosa
 * Price: 20
 * Order ID: 098
 * Status: DELIVERED
 * Food Delivery Done!
 * 
 * Food: Coke
 * Price: 10
 * Order ID: 099
 * Status: PLACED
 * Order Placed Successfully
 * Status Updated!
 * Food: Coke
 * Price: 10
 * Order ID: 099
 * Status: DELIVERED
 * Food Delivery Done!
 * 
 * Food: Biryani
 * Price: 200
 * Order ID: 100
 * Status: PREPARING
 * Food Getting Prepared
 * Status Updated!
 * Food: Biryani
 * Price: 200
 * Order ID: 100
 * Status: DELIVERED
 * Food Delivery Done!
 */