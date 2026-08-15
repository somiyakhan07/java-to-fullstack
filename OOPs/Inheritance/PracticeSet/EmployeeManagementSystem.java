// Design an Employee Management System.
// Different employee roles have common information as well as role-specific responsibilities. 
// Choose the most appropriate inheritance type and implement the complete program. (multi level)

class Employee {
    private String employeeName;
    private String employeeId;
    private double salary;
    private String department;

    public Employee(String employeeName, String employeeId, double salary, String department) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(String employeeName, String employeeId, double salary, String department, int teamSize,
            String projectName) {
        super(employeeName, employeeId, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}

class SeniorManager extends Manager {
    private int experience;
    private String managedDepartments;

    public SeniorManager(String employeeName, String employeeId, double salary, String department, int teamSize,
            String projectName, int experience, String managedDepartments) {
        super(employeeName, employeeId, salary, department, teamSize, projectName);
        this.experience = experience;
        this.managedDepartments = managedDepartments;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getManagedDepartments() {
        return managedDepartments;
    }

    public void setManagedDepartments(String managedDepartments) {
        this.managedDepartments = managedDepartments;
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Manager object
        Manager m1 = new Manager(
                "Rahul",
                "EMP101",
                60000,
                "IT",
                10,
                "Banking Application");

        System.out.println("----Manager Details----");
        System.out.println("Employee Name: " + m1.getEmployeeName());
        System.out.println("Employee ID: " + m1.getEmployeeId());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Department: " + m1.getDepartment());
        System.out.println("Team Size: " + m1.getTeamSize());
        System.out.println("Project Name: " + m1.getProjectName());

        // Senior Manager object
        SeniorManager sm1 = new SeniorManager(
                "Priya",
                "EMP201",
                100000,
                "Management",
                25,
                "Company Expansion",
                10,
                "IT, HR, Finance");

        System.out.println();
        System.out.println("----Senior Manager Details----");
        System.out.println("Employee Name: " + sm1.getEmployeeName());
        System.out.println("Employee ID: " + sm1.getEmployeeId());
        System.out.println("Salary: " + sm1.getSalary());
        System.out.println("Department: " + sm1.getDepartment());
        System.out.println("Team Size: " + sm1.getTeamSize());
        System.out.println("Project Name: " + sm1.getProjectName());
        System.out.println("Experience: " + sm1.getExperience() + " years");
        System.out.println("Managed Departments: " + sm1.getManagedDepartments());
    }
}

/*output:
----Manager Details----
Employee Name: Rahul
Employee ID: EMP101
Salary: 60000.0
Department: IT
Team Size: 10
Project Name: Banking Application

----Senior Manager Details----
Employee Name: Priya
Employee ID: EMP201
Salary: 100000.0
Department: Management
Team Size: 25
Project Name: Company Expansion
Experience: 10 years
Managed Departments: IT, HR, Finance
 */