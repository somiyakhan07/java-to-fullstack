// Q5 — Multiple Annotations
// ============================================================
//
// Create a class that uses both @Override and @Deprecated.
//
// Goal:
// Practice multiple annotations.

class A {

    @Deprecated
    public void oldMethod() {
        // @Deprecated tells developers that this method is old and should generally be avoided.
        System.out.println("in A oldMethod");
    }
}

class B extends A { // B inherits A

    @Override
    public void oldMethod() {
        // @Override means this method overrides the parent method.
        System.out.println("in B oldMethod");
    }
}

public class MultipleAnnotation {

    public static void main(String[] args) {

        // A reference points to an A object.
        A a = new A();
        a.oldMethod(); // Warning because A's method is deprecated.

        // B reference points to a B object.
        B b = new B();
        b.oldMethod(); // Calls B's overridden method.
    }
}

/*
 * Important:
 *
 * @Deprecated -> marks a method as old/deprecated.
 * @Override   -> tells the compiler that a method overrides a parent method.
 *
 * Note:
 * @Deprecated is NOT automatically inherited by the overriding method.
 * Therefore, B.oldMethod() is not deprecated unless we also write:
 *
 * @Deprecated
 * @Override
 *
 * Output:
 * in A oldMethod
 * in B oldMethod
 */