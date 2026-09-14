/*
 * Q3 — Interface Variables
 *
 * Create an interface College with:
 * String NAME = "ABC College";
 *
 * Create a class Student that implements College.
 *
 * In main():
 * - Print NAME.
 * - Try to change the value of NAME.
 * - Observe the error.
 */

interface College {

    // Interface variable is public, static and final by default
    String NAME = "ABC College";
}

class Student implements College {

}

public class InterfaceVariable {

    public static void main(String[] args) {

        // Print the interface variable
        System.out.println(College.NAME);

        // Try to change the value of NAME
        // NAME = "XYZ College"; // This gives an error because NAME is final
    }
}

/*
 * Output before the error:
 * ABC College
 *
 * Important:
 * Interface variables are final by default, so their value cannot be changed.
 */