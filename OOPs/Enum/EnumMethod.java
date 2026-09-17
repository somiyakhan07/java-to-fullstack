// Q8 — Enum Method
// ============================================================
//
// Create an enum TrafficLight with:
// - RED
// - YELLOW
// - GREEN
//
// Add a method getMessage() that returns:
// - RED → "Stop"
// - YELLOW → "Wait"
// - GREEN → "Go"
//
// In main():
// - Call getMessage() for GREEN.
// - Print the returned message.
//
// Goal:
// Understand how methods can be defined inside an enum.

enum TrafficLight {
    RED, YELLOW, GREEN;

    // Method returns a message based on the current enum constant
    public String getMessage() {

        // 'this' means the current enum constant
        if (this == TrafficLight.RED) {
            return "Stop";
        }
        else if (this == TrafficLight.YELLOW) {
            return "Wait";
        }
        else {
            return "Go";
        }
    }
}

public class EnumMethod {

    public static void main(String[] args) {

        // Store GREEN enum constant in the variable
        TrafficLight light = TrafficLight.GREEN;

        // getMessage() returns "Go", which is then printed
        System.out.println(light.getMessage());
    }
}

// Output:
// Go

/*
 * Explanation:
 *
 * getMessage() is a method inside the enum.
 *
 * Since the method returns a String, its return type is String.
 *
 * 'this' represents the current enum constant.
 *
 * light = TrafficLight.GREEN
 * Therefore, inside getMessage():
 *
 * this == TrafficLight.GREEN
 *
 * is true, so the method returns "Go".
 *
 * Important:
 * return -> sends a value back to the caller.
 * System.out.println() -> prints the returned value.
 */