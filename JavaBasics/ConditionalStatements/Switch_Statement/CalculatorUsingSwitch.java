// Calculatir using switch

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        int a = 23;
        int b = 19;
        char calc = '+';

        switch (calc) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }

                break;
            case '%':
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Cannot modulus by zero");
                }

                break;

            default:
                System.out.println("Invalid Operation");
        }
    }

}
// 23 + 19 = 42