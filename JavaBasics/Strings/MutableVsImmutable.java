// Demonstrates Mutable vs Immutable objects in Java

public class MutableVsImmutable {
    public static void main(String[] args) {

        // String is immutable (cannot be changed)
        String str = "Java"; // stores in String Pool

        // concat() creates a new String object and store in String pool,
        // but we are not storing it, so the original String remains unchanged and it will point at java
        str.concat("Programming");
        System.out.println(str); 


        
        // StringBuilder is mutable (can be changed)
        StringBuilder sb = new StringBuilder("Java"); // stores in Heap Memory as an object

        // append() modifies the same object
        sb.append(" Programming");
        System.out.println(sb); // Java Programming (Mutable)

    }

}
/*
O/P:
  Java
  java Programming
 
// String literals -> String Pool
// StringBuilder objects -> Heap Memory
// StringBuffer objects -> Heap Memory
 */
