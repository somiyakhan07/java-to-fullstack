// Q9 — Lambda with Collection
// ============================================================
//
// Create an ArrayList of names.
//
// Use forEach() with a lambda expression to print
// each name.
//
// Goal:
// Understand how lambda expressions are used with collections.

import java.util.ArrayList;

public class LambdaWithCollection {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sonia");
        names.add("Neha");
        names.add("Mohini");

        // forEach() takes each name one by one
        // Lambda prints each name
        names.forEach(n -> System.out.println(n));
    }
}

// Output:
// Sonia
// Neha
// Mohini
//
// Explanation:
// forEach() is a method used to process each element
// of the collection.
//
// n -> System.out.println(n) is a lambda expression.
// Here, n represents each name in the ArrayList.
//
// Note:
// for(String n : names) is a for-each loop,
// but names.forEach(n -> ...) uses a lambda expression.