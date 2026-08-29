//  Auto-unboxing
// Create a program where:
// Integer object ko int variable mein assign karo.
// Double object ko double variable mein assign karo.
// Values print karo.
// Concept: Wrapper → Primitive (Auto-unboxing)

public class AutoUnBoxing {
    public static void main(String[] args) {
        int a1 = 20;
        Integer b1 = a1; // Autoboxing: int -> Integer
        int c1 = b1; // Auto-UnBoxing: Integer -> int

        double a2 = 3.14;
        Double b2 = a2; // Autoboxing: double -> Double
        double c2 = b2; // Auto-Unboxing: Double -> double

        System.out.println("----Primitive Data Type----");
        System.out.println("int: " + a1);
        System.out.println("double: " + a2);
        System.out.println();

        System.out.println("----Auto-Boxing & Wrapper class object reference variable values----");
        System.out.println("Integer: " + b1);
        System.out.println("Double: " + b2);
        System.out.println();

        System.out.println("----Auto-Unboxing & primitive data types----");
        System.out.println("Integer -> int: " + c1);
        System.out.println("Double -> double: " + c2);

    }

}
/* output:
----Primitive Data Type----
int: 20
double: 3.14

----Auto-Boxing & Wrapper class object reference variable values----
Integer: 20
Double: 3.14

----Auto-Unboxing & primitive data types----
Integer -> int: 20
Double -> double: 3.14
 */