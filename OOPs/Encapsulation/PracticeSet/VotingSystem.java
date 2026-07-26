// Voting system - requried minimum age 18 for eligiblility 

class CheckEligiblility { // create check eligibility class 
    private String name;
    private int age;


    public CheckEligiblility(){ // default constructor
        name = "your name";
        age = 18;
    }

    public CheckEligiblility(String name, int age) { //parameterized constructor with age validition
        this.name = name;
        if (age >= 18) { // check requried age
            this.age = age;
        } else {
            System.out.println("You are not eligible for voting");
            System.out.println("Minimum required age is 18"); // display if not eligible
        }

    }

    public String getName(){ // fetch name
        return name;
    }

    public void setName(String name){ // set name in private name variable
        this.name = name;
    }

    public int getAge() { // fetch age
        return age;
    }

    public void setAge(int age) { // set age in private age variable with age validation
        if (age >= 18) { // check age
            this.age = age;
            System.out.println("Eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
            System.out.println("Minimum required age is 18");
        }
    }
}

public class VotingSystem { // main class
    public static void main(String[] args){ // main method
        CheckEligiblility e1 = new CheckEligiblility(); // create class object e1
        e1.setName("Vira"); // set name
        e1.setAge(22);  // set age

        System.out.println("Name: " + e1.getName()); // display name
        System.out.println("Age: " + e1.getAge()); // display name and voting eligiblity
    }
    
}

/* output:
Eligible for voting
Name: Vira
Age: 22
 */