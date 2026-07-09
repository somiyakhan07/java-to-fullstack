// Calculator using switch expression

public class CalculatorUsingSwitchExpression {

    public static void main(String[] args){
        int num1 = 8;
        int num2 = 0;
        char operator = '/';
        boolean notEqualToZero = (num2 != 0);


        String result = switch (operator){
            case '+' -> num1  + " + " + num2 + " = " + (num1 + num2); // Addition
            case '-' -> num1 +  " - " + num2 + " = " + (num1 - num2); // Subtraction
            case '*' -> +  num1 +  " * "  + num2 + " = " + (num1 * num2); // Multiplication
            case '/' -> {
                if(notEqualToZero){
                   yield num1 +  " / "  + num2 + " = " + (num1 / num2); // Division
                } else {
                    yield "Cannot divide by zero"; // Print if num2 is zero
                }
            }
            case '%' -> {
                if(notEqualToZero){
                    yield num1 +  " % "  + num2 + " = " + (num1 % num2); // Modulus
                } else {
                    yield "Cannot modulus by zero"; // Print if num2 is zero
                }
            }
            default -> "Invalid operator"; // for invalid input
            


        };
        System.out.println(result);
    }

}
// Cannot divide by zero
