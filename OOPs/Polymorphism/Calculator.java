// Create overloaded adde() methods to perform:
// Addition of 2 numbers
// Addition of 3 numbers
// Addition of 2 double values

class Add {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Add a1 = new Add();
        int result = a1.add(3, 4);
        System.out.println(result);

        int result2 = a1.add(4, 4, 5);
        System.out.println(result2);

        double result3 = a1.add(2.34, 3.14);
        System.out.println(result3);

    }

}

/* output:
7
13
5.48
 */