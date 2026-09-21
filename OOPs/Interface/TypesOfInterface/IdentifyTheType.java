// Q5 — Identify the Type
// ============================================================
//
// For each interface, identify whether it is:
// 1. Normal Interface
// 2. Functional Interface
// 3. Marker Interface
//
// interface A {
//     void show();
//     void display();
// }
//
// interface B {
//     void run();
// }
//
// interface C {
// }
//
// Also write why each interface belongs to that category.
//
// Goal:
// Identify different types of interfaces.

interface A {
    // Normal Interface
    // It has multiple abstract methods.

    void show();
    void display();
}

@FunctionalInterface
interface B {
    // Functional Interface
    // It has exactly ONE abstract method.

    void run();

    // It can also have default and static methods.
}

interface C {
    // Marker Interface
    // It is an empty interface.
}

public class IdentifyTheType {

}

/*
 * Explanation:
 *
 * Interface A → Normal Interface. It has multiple abstract methods.
 *
 * Interface B → Functional Interface
 * It has exactly ONE abstract method.
 * It can also have default and static methods.
 *
 * Interface C → Marker Interface
 * It is an empty interface and contains no methods.
 */