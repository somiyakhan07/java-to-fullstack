public class CheckEligibleToVote {
    public static void main(String[] args) {
        String name = "isha";
        int age = 22;
        boolean indianCitizen = true;

        if (age >= 18 && indianCitizen) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Indian Citizen");
            System.out.println("Eligible To Vote");

        }
    }
}

/*
 * O/P:
 * Name: isha
 * Age: 22
 * Indian Citizen
 * Eligible To Vote
 */