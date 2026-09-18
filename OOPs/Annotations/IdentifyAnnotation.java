
// Q7 — Identify the Annotation
// ============================================================
//
// Create examples demonstrating:
// 1. Method overriding
// 2. An outdated method
//
// Use the appropriate annotation for each case.
//
// Goal:
// Identify the correct annotation for a situation.

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
        // @Override confirms that B is overriding A's method.
        System.out.println("in B method");
    }
}

public class IdentifyAnnotation {

    public static void main(String[] args) {

        A a = new A();
        a.method(); // Warning because A.method() is deprecated.

        B b = new B();
        b.method(); // Calls B's overridden method.
    }
}

/*
 * Important:
 *
 * @Deprecated -> used for an outdated/deprecated method.
 * @Override   -> used when overriding a parent/interface method.
 *
 * Note:
 * @Deprecated is not automatically inherited by the overriding method.
 *
 * Output:
 * in A method
 * in B method
 */