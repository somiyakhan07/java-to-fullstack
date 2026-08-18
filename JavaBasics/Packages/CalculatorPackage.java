// Create a user-defined package named calculator containing two classes: Addition and Subtraction. 
// Create methods to perform addition and subtraction. Import these classes into another Java program and display the results.

import myPackages.Calculator.Addition; // Import Addition class
import myPackages.Calculator.Subtraction; // Import Subtraction class

import java.util.Scanner; // Import Scanner for user input

public class CalculatorPackage { // Main class

    public static void main(String[] args) { // Main method

        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Addition
        System.out.println("----Addition----");

        System.out.print("Enter Number 1: "); // Take first number
        int n1 = sc.nextInt();

        System.out.print("Enter Number 2: "); // Take second number
        int n2 = sc.nextInt();

        Addition a1 = new Addition(n1, n2); // Create Addition object

        int addResult = a1.add(); // Call addition method

        System.out.println(
                a1.getN1() + " + " + a1.getN2() + " = " + addResult
        );

        System.out.println();

        // Subtraction
        System.out.println("----Subtraction----");

        System.out.print("Enter Number 1: "); // Take first number
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2: "); // Take second number
        int num2 = sc.nextInt();

        Subtraction s1 = new Subtraction(num1, num2); // Create Subtraction object

        int subResult = s1.sub(); // Call subtraction method

        System.out.println(
                s1.getN1() + " - " + s1.getN2() + " = " + subResult
        );

        sc.close(); // Close Scanner
    }
}

/*output:
 ----Addition----
Enter Number 1: 2
Enter Number 2: 2
2 + 2 = 4

----Subtraction----
Enter Number 1: 4
Enter Number 2: 2
4 - 2 = 2 
*/