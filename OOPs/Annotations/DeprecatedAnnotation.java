// Q3 — @Deprecated
// ============================================================
//
// Create a method oldMethod() and mark it as deprecated.
//
// Call the method from main().
//
// Goal:
// Understand @Deprecated.

class Demo {

    @Deprecated
    public void oldMethod() {

        // This method is old and should generally be avoided
        System.out.println("In old method");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args) {

        // Demo reference pointing to a Demo object
        Demo d = new Demo();

        // Calling a deprecated method
        // compiler showing us a warning
        d.oldMethod();
    }
}

// Output:
// In old method

/*
 * Explanation:
 *
 * @Deprecated marks a method, class, or field as outdated.
 *
 * It tells us:
 * "This feature is still available, but you should generally avoid using it."
 *
 * Calling a deprecated method usually gives a warning, not necessarily a compilation error.
 *
 * Important:
 * @Deprecated -> marks something as outdated.
 * @Override -> checks method overriding.
 */