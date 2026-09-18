
// Q8 — Annotation Challenge
// ============================================================
//
// Create a small Java program that demonstrates
// the practical use of @Override, @Deprecated,
// and @SuppressWarnings.
//
// Goal:
// Revise commonly used built-in annotations.

class A {

    @Deprecated
    public void method() {
        // @Deprecated marks this method as outdated.
        System.out.println("in A method");
    }
}

class B extends A {

    @Override
    public void method() {
        // @Override confirms that B overrides A's method.
        System.out.println("in B method");
    }
}

public class AnnotationChallenge {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        A a = new A();
        a.method(); // Deprecation warning is suppressed.

        B b = new B();
        b.method(); // Calls B's overridden method.
    }
}

/*
 * Important:
 *
 * @Deprecated -> Marks a method as outdated.
 *
 * @Override
 * → Confirms that a method overrides a parent/interface method.
 *
 * @SuppressWarnings("deprecation") -> Suppresses the warning caused by using a deprecated method.
 *
 * Output:
 * in A method
 * in B method
 */