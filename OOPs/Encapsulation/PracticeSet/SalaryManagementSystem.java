// Employee Salary - Design an Employee Salary Management system.
// The system should store an employee's salary and allow the salary to be increased by a given percentage.

class Employee { // create class employee
    private String employeeName; // private variables
    private double salary;

    public Employee() { // default constructor
        employeeName = "name";
        salary = 0;
    }

    public Employee(String employeeName, double salary) { // parameterized constructor
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeName() { // fetch employee name
        return employeeName;
    }

    public void setEmployeeName(String employeeName) { // set employee name in private variable
        this.employeeName = employeeName;
    }

    public double getSalary() { // fetch salary
        return salary;
    }

    public void setSalary(double salary) { // set salary in private variable
        this.salary = salary;
    }

    public void salaryIncrease(double percentage) { // Increment calculation
        percentage = percentage / 100;

        double increment = salary * percentage;

        salary = salary + increment;
    }
}

public class SalaryManagementSystem { // main class
    public static void main(String[] args) { // main method
        Employee e1 = new Employee("priya", 20000); // create class obj e1
        System.out.println("Employee name: " + e1.getEmployeeName()); // display name
        System.out.println("Old salary: " + e1.getSalary()); // display salary
        e1.salaryIncrease(10); // take increment percentage
        System.out.println("Incremented salary: " + e1.getSalary()); // display incremented salary

    }

}
/* output:
Employee name: priya
Old salary: 20000.0
Incremented salary: 22000.0
 */