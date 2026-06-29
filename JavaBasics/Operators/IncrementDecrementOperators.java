// Demonstrate Increment and Decrement Operators

public class IncrementDecrementOperators {
    public static void main(String args[]) {
        int num1 = 4;
        num1++; // post-increment ++
        System.out.println("After post-increment ++ of num1: " + num1);

        int num2 = 5;
        ++num2; // ++ pre-increment
        System.out.println("After ++ pre-increment of num2: " + num2);

        int num3 = 7;
        num3--; // post-decrement --
        System.out.println("After post-decrement -- of num3: " + num3);

        int num4 = 9;
        --num4; // -- pre-decrement
        System.out.println("After -- pre-decrement: of num4: " + num4);
    }
}
/*
After post-increment ++ of num1: 5
After ++ pre-increment of num2: 6
After post-decrement -- of num3: 6
After -- pre-decrement: of num4: 8
 */