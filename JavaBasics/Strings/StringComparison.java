public class StringComparison { 
    public static void main(String[] args){
        String name = "Salman Khan";
        String name1 = new String("Salman Khan");
        String name2 = "Cutie";
        String name3 = "salman khan";

        System.out.println("name == name: " + (name == name1));  
        // == compares object references (memory addresses).
        // name is stored in the String Pool and name1 is a new object in Heap Memory.
        // Since both references are different, the result is false.

        System.out.println("name.equals(name1): "  + (name.equals(name1))); // equals() compares the actual content of two strings
        System.out.println("name.equalsIgnoreCase(name3): " + (name.equalsIgnoreCase(name1))); // equalsIgnoreCase() compares content without checking letter case
        System.out.println("name.compareTo(name2): " + (name.compareTo(name2))); 
    
        // compareTo() compares strings in alphabetical order.
        // Checks characters one by one.
        // Returns a positive number if the first string comes after the second.
        // Returns a negative number if the first string comes before the second.
        // Returns 0 if both strings are equal.

        /* 
        # More Example of compareTo()

        "Apple".compareTo("Ball") → Negative (Apple comes first)
        "Dog".compareTo("Cat") → Positive (Dog comes after)
        "Java".compareTo("Java") → 0 (Same word)

         */
    }
    
}
/*O/P:
name == name: false
name.equals(name1): true
name.equalsIgnoreCase(name3): true
name.compareTo(name2): 16
 */
