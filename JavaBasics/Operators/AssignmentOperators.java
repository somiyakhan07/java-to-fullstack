// Demonstrates assignment operators in Java

class AssignmentOperators {
    public static void main(String args[]) {

        int num = 10;
        System.out.println(num);

        int num1 = 8;
        num1 += 6;
        System.out.println("After += : " + num1);

        int num2 = 4;
        num2 -= 2;
        System.out.println("After -= : " + num2);

        int num3 = 5;
        num3 *= 2;
        System.out.println("After *= : " + num3);

        int num4 = 6;
        num4 /= 2;
        System.out.println("After /= : " + num4);

        int num5 = 20;
        num5 %= 2;
        System.out.println("After %= : " + num5);

    }
}

/*
 * O/P:
 * 10
 * After += : 14
 * After -= : 2
 * After *= : 10
 * After /= : 3
 * After %= : 0
 */