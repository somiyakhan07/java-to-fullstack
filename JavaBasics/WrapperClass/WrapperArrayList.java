// Wrapper + ArrayList
// Create an ArrayList<Integer> and add 5 integers.
// Print all the numbers.
// Concept: Collections use Wrapper Classes (Integer) instead of primitives (int).

import java.util.ArrayList;

public class WrapperArrayList {
    public static void main(String[] args) {

        // Create ArrayList of Integer wrapper objects
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 integers (Autoboxing: int → Integer)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print all numbers
        System.out.println(numbers);
    }
}

/* Output:
[10, 20, 30, 40, 50]
*/