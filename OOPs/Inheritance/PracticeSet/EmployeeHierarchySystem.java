// Design an Employee Hierarchy System.
// A Team Lead is an Employee, and every Employee is a Person.
// Store suitable information at each level and show how the Team Lead
// class inherits everything from its parent classes.

import java.util.Scanner;

// Parent / Grandparent class
class Person {
    private String name;
    private int age;
    private boolean isIndian;

    // Parameterized constructor
    public Person(String name, int age, boolean isIndian) {
        this.name = name;
        this.age = age;
        this.isIndian = isIndian;
    }

    // Get person's name
    public String getName() {
        return name;
    }

    // Set person's name
    public void setName(String name) {
        this.name = name;
    }

    // Get person's age
    public int getAge() {
        return age;
    }

    // Set person's age
    public void setAge(int age) {
        this.age = age;
    }

    // Get Indian citizen status
    public boolean isIndian() {
        return isIndian;
    }

    // Set Indian citizen status
    public void setIndian(boolean isIndian) {
        this.isIndian = isIndian;
    }
}

// Child class of Person
class Employee extends Person {
    private boolean isEmployee;
    private int salary;

    // Parameterized constructor
    public Employee(String name, int age, boolean isIndian, boolean isEmployee, int salary) {
        super(name, age, isIndian); // Call Person constructor
        this.isEmployee = isEmployee;
        this.salary = salary;
    }

    // Get employee status
    public boolean isEmployee() {
        return isEmployee;
    }

    // Set employee status
    public void setEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    // Get employee salary
    public int getSalary() {
        return salary;
    }

    // Set employee salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

// Child class of Employee
class TeamLead extends Employee {
    private boolean isTeamLeader;

    // Parameterized constructor
    public TeamLead(String name, int age, boolean isIndian,
            boolean isEmployee, int salary, boolean isTeamLeader) {

        super(name, age, isIndian, isEmployee, salary); // Call Employee constructor
        this.isTeamLeader = isTeamLeader;
    }

    // Get team lead status
    public boolean isTeamLeader() {
        return isTeamLeader;
    }

    // Set team lead status
    public void setTeamLeader(boolean isTeamLeader) {
        this.isTeamLeader = isTeamLeader;
    }
}

// Main class
public class EmployeeHierarchySystem {

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take person's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Take person's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        // Take Indian citizen status
        System.out.print("Are you an Indian Citizen? Enter only true or false: ");
        boolean isIndian = sc.nextBoolean();
        sc.nextLine();

        // Take employee status
        System.out.print("Are you an Employee? Enter only true or false: ");
        boolean isEmployee = sc.nextBoolean();
        sc.nextLine();

        // Take salary
        System.out.print("Enter Your Salary: ");
        int salary = sc.nextInt();
        sc.nextLine();

        // Take team lead status
        System.out.print("Are you a Team Lead? Enter only true or false: ");
        boolean isTeamLeader = sc.nextBoolean();
        sc.nextLine();

        // Create TeamLead object
        TeamLead tl1 = new TeamLead(
                name, age, isIndian, isEmployee, salary, isTeamLeader
        );

        // Display employee details
        System.out.println();
        System.out.println("---- Employee Details ----");

        // Methods inherited from Person
        System.out.println("Employee Name: " + tl1.getName());
        System.out.println("Employee Age: " + tl1.getAge());
        System.out.println("Employee is Indian: " + tl1.isIndian());

        // Methods inherited from Employee
        System.out.println("Is Employee: " + tl1.isEmployee());
        System.out.println("Employee Salary: " + tl1.getSalary());

        // TeamLead's own method
        System.out.println("Is Team Lead: " + tl1.isTeamLeader());

        sc.close();
    }
}

/*output:
Enter your name: Aliya
Enter your age: 22
Are you an Indian Citizen? Enter only true or false: true
Are you an Employee? Enter only true or false: true
Enter Your Salary: 200000
Are you a Team Lead? Enter only true or false: true

---- Employee Details ----
Employee Name: Aliya
Employee Age: 22
Employee is Indian: true
Is Employee: true
Employee Salary: 200000
Is Team Lead: true
 */