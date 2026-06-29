public class BitwiseOperators {
    public static void main(String args[]) {
        int a = 5;
        int b = 3;

        System.out.println("a & b = " + (a & b)); // AND
        System.out.println("a | b = " + (a | b)); // OR
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a)); // NOT
    }
}

/*
 * Output:
 * a & b = 1
 * a | b = 7
 * a ^ b = 6
 * ~a = -6
 */