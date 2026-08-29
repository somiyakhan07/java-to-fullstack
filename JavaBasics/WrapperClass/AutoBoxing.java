// Autoboxing
// Create a program where.
// int variable ko Integer reference mein assign karo.
// double variable ko Double reference mein assign karo.
// Values print karo.
// Concept: Primitive → Wrapper (Autoboxing)

public class AutoBoxing {
    public static void main(String[] args) {
        int a1 = 20;
        Integer b1 = a1; // Autoboxing: int → Integer

        double a2 = 3.14;
        Double b2 = a2; // Autoboxing: double → Double

        System.out.println("----Auto-Boxing----");
        System.out.println("int: " + a1);
        System.out.println("Integer: " + b1);
        System.out.println();
        System.out.println("double: " + a2);
        System.out.println("Double: " + b2);
    }

}
/*
 * output:
 * ----Auto-Boxing----
 * int: 20
 * Integer: 20
 * 
 * double: 3.14
 * Double: 3.14
 */