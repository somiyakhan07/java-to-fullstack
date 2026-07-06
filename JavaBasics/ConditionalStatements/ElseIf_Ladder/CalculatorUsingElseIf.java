// Calculator using Else If

public class CalculatorUsingElseIf {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '*';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid Input");
        }
    }

}
// 50
