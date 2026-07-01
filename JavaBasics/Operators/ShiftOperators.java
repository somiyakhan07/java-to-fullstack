public class ShiftOperators {
    public static void main(String[] args){
        int num = 8;

        System.out.println("num << 1 = " + (num << 1)); // Left Shift (Multiply by 2)
        System.out.println("num >> 1 = " + (num >> 1)); // Right Shift (Divide by 2)
        System.out.println("num >>> 1 = " + (num >>> 1)); // Unsigned Right Shift (Divide by 2 but without sign)
    }
    
}
/* O/P: 
num << 1 = 16
num >> 1 = 4
num >>> 1 = 4
 */
