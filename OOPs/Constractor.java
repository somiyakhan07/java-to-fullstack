import java.util.Scanner;

class Human {

    private int age;
    private String name;

    public Human() { // Default Constructor
        age = 18;
        name = "Rohan";
    }

    public Human(int age, String name) { // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() { // read age from input
        return age;
    }

    public void setAge(int age) { // set age in private variables
        this.age = age;
    }

    public String getName() { // read name from input
        return name;
    }

    public void setName(String name) { // set name in private variable
        this.name = name;
    }
}

public class Constractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // take user input

        System.out.println("Enter your name: ");
        String inputName = sc.nextLine(); // take name input

        System.out.println("Enter your age: ");
        int inputAge = sc.nextInt(); // take age input

        Human h1 = new Human(inputAge, inputName); // human object created h1 and set age and name input given by user
                                                   // in private variable

        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
        sc.close();

    }

}
