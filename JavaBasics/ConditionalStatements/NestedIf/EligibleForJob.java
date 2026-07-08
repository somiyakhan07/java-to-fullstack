// Check for job eligiblity

public class EligibleForJob {
    public static void main(String[] args) {
        String name = "Sunny";
        int age = 21;
        boolean indian = true;
        boolean degree = true;

        if (age >= 18) { // check if under age
            if (indian && degree) { // check indian citizen and has a degree
                System.out.println("name: " + name);
                System.out.println("age: " + age);
                System.out.println("Is Indian: " + indian);
                System.out.println("This person is eligible for job.");
            } else {
                System.out.println("Not eligible for job."); // print not eligible
            }
        } else {
            System.out.println("Not eligible, under age"); // print if under age
        }
    }
}
/*
 * O/P:
 * name: Sunny
 * age: 21
 * Is Indian: true
 * This person is eligible for job.
 */