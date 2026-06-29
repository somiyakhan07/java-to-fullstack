// Shows how logical operators works in java

public class LogicalOperators {
    public static void main(String args[]) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        System.out.println(x + " > " + y + " && " + a + " > " + b + ": " + (x > y && a > b));
        System.out.println(x + " > " + y + " || " + a + " > " + b + ": " +(x > y || a > b));

        boolean result = true;
        System.out.println("!" + result + ": " + (!result));
    }

}
/*
7 > 5 && 5 > 9: false
7 > 5 || 5 > 9: true
!true: false
 */