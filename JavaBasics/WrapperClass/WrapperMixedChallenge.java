// int a = 10;
// Integer b = a;
//
// Integer c = 20;
// int d = c;
//
// Then print all four variables and add:
// a + b
// c + d
//
// Identify: Which assignments are Autoboxing and which are Auto-unboxing.

public class WrapperMixedChallenge {
    public static void main(String[] args) {

        // Autoboxing: int → Integer
        int a = 10;
        Integer b = a;

        // Auto-unboxing: Integer → int
        Integer c = 20;
        int d = c;

        // Integer b is unboxed to int before addition
        System.out.println(a + b);

        // Integer c is unboxed to int before addition
        System.out.println(c + d);
    }
}

/* Output:
20
40
*/