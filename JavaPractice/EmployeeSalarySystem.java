// Q3 — Employee Salary System
// ============================================================
//
// Create:
//
// Employee
//    ↑
// Manager
// Developer
//
// Use:
// - Inheritance
// - Constructor
// - super
// - Method Overriding
// - Polymorphism
//
// Each employee type should calculate/display salary differently.

class Employee {
    private String name;
    private String role;
    private int salary;

    // Parent constructor initializes common employee data
    public Employee(String name, int salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    // Getters allow child classes to access private data
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    // Parent method
    public void employeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String experience;
    private int teams;

    public Manager(String name, int salary, String experience, int teams) {

        // Send common employee data to parent constructor
        super(name, salary, "Manager");

        this.experience = experience;
        this.teams = teams;
    }

    // Manager provides its own version of employeeDetails()
    @Override
    public void employeeDetails() {

        int totalSalary = getSalary() + 10000;

        System.out.println("Name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Experience: " + experience);
        System.out.println("Teams: " + teams);
        System.out.println("Salary: " + totalSalary);
    }
}

class Developer extends Employee {
    private int projects;

    public Developer(String name, int salary, int projects) {

        // Send common employee data to parent constructor
        super(name, salary, "Developer");

        this.projects = projects;
    }

    // Developer provides its own version of employeeDetails()
    @Override
    public void employeeDetails() {

        int totalSalary = getSalary() + (projects * 2000);

        System.out.println("Name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Projects: " + projects);
        System.out.println("Salary: " + totalSalary);
    }
}

public class EmployeeSalarySystem {

    public static void main(String[] args) {

        // Parent reference pointing to Manager object
        Employee e1 = new Manager("Rahul", 50000, "5 Years", 3);

        // Parent reference pointing to Developer object
        Employee e2 = new Developer("Aman", 40000, 4);

        // Runtime calls the appropriate overridden method
        e1.employeeDetails();

        System.out.println();

        e2.employeeDetails();
    }
}
/*
output:
Name: Rahul
Role: Manager
Experience: 5 Years
Teams: 3
Salary: 60000

Name: Aman
Role: Developer
Projects: 4
Salary: 48000
 */

// Explanation:
// - name, role and salary are common properties of Employee.
// - Manager and Developer inherit these properties from Employee.
// - super(...) calls the Employee constructor.
// - getName(), getRole() and getSalary() access private parent data.
// - Manager and Developer override employeeDetails().
// - Employee reference can hold Manager or Developer object.
// - This is polymorphism and dynamic method dispatch.
// - Each child class calculates salary differently.