// Employee Work
// Create Employee with work().
// Override it in Developer and Tester.
// Use Employee reference to hold different child objects and call work().
// Dynamic Method Dispatch

class Employee {
    public void work() { // Parent class method
        System.out.println("Employee Work");
    }
}

class Developer extends Employee { // Developer inherits Employee
    @Override
    public void work() { // Override parent work() method
        System.out.println("Developer Work");
    }
}

class Tester extends Employee { // Tester inherits Employee
    @Override
    public void work() { // Override parent work() method
        System.out.println("Tester Work");
    }
}

public class EmployeeWork {
    public static void main(String[] args) {

        Employee e1 = new Employee(); // Parent reference + parent object
        e1.work();

        System.out.println();

        e1 = new Developer(); // Parent reference + Developer object
        e1.work(); // Developer's work() runs

        System.out.println();

        e1 = new Tester(); // Parent reference + Tester object
        e1.work(); // Tester's work() runs
    }
}

/* output:
Employee Work

Developer Work

Tester Work
 */