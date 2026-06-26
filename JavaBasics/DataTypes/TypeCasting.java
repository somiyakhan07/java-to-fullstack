// Type Casting
// Larger data type is manually converted into a smaller data type.

public class TypeCasting {
    public static void main(String args[]) {
        double d = 99.99;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        int num = 130;
        byte n = (byte)num;


        System.out.println("double value: " + d);
        System.out.println("float value: " + f);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
        System.out.println("short value: " + s);
        System.out.println("byte value: " + b);

        System.out.println(n); // -126 
        // When a value is outside the range of the target data type,
        // the result changes because the value cannot be stored correctly.
    }

}

/*
double value: 99.99
float value: 99.99
long value: 99
int value: 99
short value: 99
byte value: 99
 */
