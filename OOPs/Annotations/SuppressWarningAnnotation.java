// Q4 — @SuppressWarnings
// ============================================================
//
// Create a program that produces a warning.
// Use @SuppressWarnings to remove the warning.
//
// Goal:
// Understand @SuppressWarnings.

class Demo {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old method");
    }
}

public class SuppressWarningAnnotation {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Demo d = new Demo();

        // Calling a deprecated method normally gives a warning
        d.oldMethod();
    }
}

// Output:
// Old method

/*
 * Explanation:
 *
 * @Deprecated -> marks a method as old/deprecated.
 *
 * Calling oldMethod() normally gives a warning.
 *
 * @SuppressWarnings("deprecation")
 * -> tells the compiler to hide/suppress that warning.
 *
 * Important:
 *
 * @SuppressWarnings -> used to suppress compiler warnings.
 */