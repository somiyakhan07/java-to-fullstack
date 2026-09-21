// Q4 — Marker Interface
// ============================================================
//
// Create an empty marker interface:
//
// interface Printable {
// }
//
// Create a Document class that implements it.
//
// Create its object and check whether it is Printable
// using instanceof.
//
// Goal:
// Understand marker interfaces.

interface Printable {

    // Empty interface = Marker Interface
}

class Document implements Printable {

}

public class MarkerInterface {

    public static void main(String[] args) {

        // Printable reference points to a Document object.
        Printable p = new Document();

        // Checks whether the object is a Document.
        System.out.println(p instanceof Document);

        // Checks whether the object implements Printable.
        System.out.println(p instanceof Printable);
    }
}

// Output:
// true
// true

/*
 * Important:
 *
 * Marker Interface:
 * An empty interface used to mark a class with special information.
 *
 * Document implements Printable.
 *
 * instanceof:
 * -> checks whether an object belongs to a class
 *   or implements an interface.
 *
 * p instanceof Document   -> true
 * p instanceof Printable  -> true
 */