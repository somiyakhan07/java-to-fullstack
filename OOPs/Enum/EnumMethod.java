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

    public String getMessage() {
        if (this == TrafficLight.RED) {
            return "Stop";
        } else if (this == TrafficLight.YELLOW) {
            return "Wait";
        } else {
            return "Go";
        }
    }
}

public class EnumMethod {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.GREEN;
        System.out.println(light.getMessage());

    }

}
// Go