//Over flow example

public class OverFlowExample {
    public static void main(String args[]) {
        // maximum value a byte can store is 127.
        byte b = 127;
        System.err.println("Before Increment: " + b);
    

        b++; // Incrementing 127 gives 128

        System.out.println("After Increment: " + b);
    }

}
/* O/P:
Before Increment: 127
After Increment: -128
 */

// byte can only store value from -128 to 127
// since 128 is out of range, the value wraps around to -128.
// This is called Overflow.