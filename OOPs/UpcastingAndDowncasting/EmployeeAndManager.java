// Employee & Manager
// Create:
// Employee
// work()
// Manager
// manageTeam()
// conductMeeting()
// Do this:
// 1. Create a Manager object.
// 2. Upcast it to Employee.
// 3. Call work().
// 4. Downcast it back to Manager.
// 5. Call both Manager-specific methods.
// Also answer in comments:
// Why can't e.manageTeam() be called while e is an Employee reference?

class Employee {
    public void work() {
        System.out.println("Work Done");
    }
}

class Manager extends Employee {
    public void manageTeam() {
        System.out.println("Managing Team");
    }

    public void conductMeeting() {
        System.out.println("Onboarding Meeting");
    }
}

public class EmployeeAndManager {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Employee e = m1;
        e.work();
        // e.manageTeam(); // Error
        // e is an Employee reference, so it can only access Employee methods.
        // Manager methods are not directly available through e.

        Manager m2 = (Manager) e;
        m2.manageTeam();
        m2.conductMeeting();
    }
}

/* output:
Work Done
Managing Team
Onboarding Meeting
 */