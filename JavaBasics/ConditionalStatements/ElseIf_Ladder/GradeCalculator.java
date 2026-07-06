// Grade Calculator

public class GradeCalculator {
    public static void main(String[] args) {
        String name = "Kat";
        int marks = 45;

        if (marks >= 91) {
            System.out.println(name + ": grade A");
        } else if (marks >= 71) {
            System.out.println(name + ": grade B");
        } else if (marks >= 51) {
            System.out.println(name + ": grade C");
        } else if (marks >= 41) {
            System.out.println(name + ": grade D");
        } else if (marks >= 35) {
            System.out.println(name + ": grade E");
        } else {
            System.out.println(name + ": grade F");
        }
    }

}
// Kat: grade A