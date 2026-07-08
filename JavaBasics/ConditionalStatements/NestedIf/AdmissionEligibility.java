// check admission eligibility

public class AdmissionEligibility {
    public static void main(String[] args) {
        // input
        String name = "sonia";
        int age = 17;
        boolean Pass_12 = true;

        //program
        if (age >= 17) { // check age 
            if (Pass_12) { // check 12th pass eligibility
                System.out.println("Name: " + name + " ," + " age: " + age + " = " + "eligible for admission.");
            } else {
                System.out.println("Name: " + name + " , " + " age: " + age + " = " +
                        "Not eligible for admission. You must pass 12th to be eligible for admission."); // print if not 12th pass 
            }
        } else {
            System.out.println("Name: " + name + " , " + " age: " + age + " = " + "Not eligible, you are under age"); // print if under age
        }

    }

}

// Name: sonia , age: 17 = eligible for admission.
