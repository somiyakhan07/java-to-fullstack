// Write a Java program to demonstrate the use of a built-in package. 
// Import the java.util.Scanner class and use it to take two numbers as input from the user. 
// Create a calculator method to add the two numbers and display the result.

import java.util.Scanner; // Built in java packages

class Calc { // class created
    public int add(int n1, int n2) { // add method
        return n1 + n2;
    }
}

public class BuiltInPackages { // main class
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in); // Take user input

        System.out.print("Enter number 1: "); // Take n1 from user 
        int n1 = sc.nextInt(); // Scan n1 number

        System.out.print("Enter number 2: "); // Take n2 from user 
        int n2 = sc.nextInt(); // Scan n1 number

        Calc c1 = new Calc(); // Calc class object created
        int result = c1.add(n1, n2); // calls add method and put user value

        System.out.println(n1 + " + " + n2 + " = " + result); // print result

        sc.close();
    }

}
/*
output:
Enter number 1: 10
Enter number 2: 5
10 + 5 = 15 
*/