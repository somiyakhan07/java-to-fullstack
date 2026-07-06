// Find largest of three number

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 56;
        int num3 = 32;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1: " + num1 + " is largest number.");
        } else if (num2 > num3) {
            System.out.println("num2: " + num2 + " is largest number.");
        } else {
            System.out.println("num3: " + num3 + " is largest number.");
        }
    }

}
// num2: 56 is largest number.