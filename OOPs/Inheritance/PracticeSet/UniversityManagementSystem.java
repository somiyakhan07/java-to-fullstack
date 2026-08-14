// Design a University Management System.
// Model different types of people in a university using inheritance.
// Decide which inheritance type is the most suitable and organize the classes accordingly.

// Parent class
// University contains common information shared by Student, Teacher and Staff.
class University {

    private String universityName;
    private String collegeName;

    // Parameterized constructor of parent class
    public University(String universityName, String collegeName) {
        this.universityName = universityName;
        this.collegeName = collegeName;
    }

    // Get university name
    public String getUniversityName() {
        return universityName;
    }

    // Set university name
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    // Get college name
    public String getCollegeName() {
        return collegeName;
    }

    // Set college name
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}


// Child class of University
// Student inherits common university information from University.
class StudnetsDetail extends University {

    private String studentName;
    private int Age;
    private int rollNo;
    private int phoneNo;
    private String courseName;
    private String std;
    private int courseYear;
    private int prnNumber;

    // Parameterized constructor of Student class
    public StudnetsDetail(String universityName, String collegeName, String studentName, int age, int rollNo,
            int phoneNo, String courseName, String std, int courseYear, int prnNumber) {

        // Call parent class constructor
        super(universityName, collegeName);

        this.studentName = studentName;
        Age = age;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.courseName = courseName;
        this.std = std;
        this.courseYear = courseYear;
        this.prnNumber = prnNumber;
    }

    // Get student name
    public String getStudentName() {
        return studentName;
    }

    // Set student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Get student age
    public int getAge() {
        return Age;
    }

    // Set student age
    public void setAge(int age) {
        Age = age;
    }

    // Get student roll number
    public int getRollNo() {
        return rollNo;
    }

    // Set student roll number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Get student phone number
    public int getPhoneNo() {
        return phoneNo;
    }

    // Set student phone number
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Set course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Get current standard/year
    public String getStd() {
        return std;
    }

    // Set current standard/year
    public void setStd(String std) {
        this.std = std;
    }

    // Get total course years
    public int getCourseYear() {
        return courseYear;
    }

    // Set total course years
    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    // Get student PRN number
    public int getPrnNumber() {
        return prnNumber;
    }
}


// Child class of University
// Teacher also inherits common university information from University.
class Teacher extends University {

    private String teacherName;
    private String UniversityID;
    private String subjects;
    private String classAllot;
    private double salary;

    // Parameterized constructor of Teacher class
    public Teacher(String universityName, String collegeName, String teacherName, String universityID, String subjects,
            String classAllot, double salary) {

        // Call parent class constructor
        super(universityName, collegeName);

        this.teacherName = teacherName;
        UniversityID = universityID;
        this.subjects = subjects;
        this.classAllot = classAllot;
        this.salary = salary;
    }

    // Get teacher name
    public String getTeacherName() {
        return teacherName;
    }

    // Set teacher name
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    // Get teacher university ID
    public String getUniversityID() {
        return UniversityID;
    }

    // Set teacher university ID
    public void setUniversityID(String universityID) {
        UniversityID = universityID;
    }

    // Get subjects taught by teacher
    public String getSubjects() {
        return subjects;
    }

    // Set subjects
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    // Get class allotted to teacher
    public String getClassAllot() {
        return classAllot;
    }

    // Set class allotted
    public void setClassAllot(String classAllot) {
        this.classAllot = classAllot;
    }

    // Get teacher salary
    public double getSalary() {
        return salary;
    }

    // Set teacher salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}


// Child class of University
// Staff also inherits common university information from University.
class Staff extends University {

    private String staffName;
    private String staffId;
    private String staffWork;
    private double staffSalary;

    // Parameterized constructor of Staff class
    public Staff(String universityName, String collegeName, String staffName, String staffId, String staffWork,
            double staffSalary) {

        // Call parent class constructor
        super(universityName, collegeName);

        this.staffName = staffName;
        this.staffId = staffId;
        this.staffWork = staffWork;
        this.staffSalary = staffSalary;
    }

    // Get staff name
    public String getStaffName() {
        return staffName;
    }

    // Set staff name
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    // Get staff ID
    public String getStaffId() {
        return staffId;
    }

    // Set staff ID
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    // Get staff work
    public String getStaffWork() {
        return staffWork;
    }

    // Set staff work
    public void setStaffWork(String staffWork) {
        this.staffWork = staffWork;
    }

    // Get staff salary
    public double getStaffSalary() {
        return staffSalary;
    }

    // Set staff salary
    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }
}


// Main class
public class UniversityManagementSystem {

    // Main method
    public static void main(String[] args) {

        // Create Student object
        StudnetsDetail s1 = new StudnetsDetail(
                "BAMU",
                "Vasantrao Kale College Of Management Science Kallam",
                "Aliya",
                22,
                15,
                88453409,
                "BCS",
                "2nd year",
                3,
                2026749400);

        // Display Student details
        System.out.println("----Student Details----");
        System.out.println("University Name: " + s1.getUniversityName());
        System.out.println("College Name: " + s1.getCollegeName());
        System.out.println("Student PRN No: " + s1.getPrnNumber());
        System.out.println("Student Name: " + s1.getStudentName());
        System.out.println("Student Age: " + s1.getAge());
        System.out.println("Student Phone no: " + s1.getPhoneNo());
        System.out.println("Student inrolled in course: " + s1.getCourseName());
        System.out.println("Student current std/year: " + s1.getStd());
        System.out.println("Student total year course: " + s1.getCourseYear());


        // Create Teacher object
        Teacher t1 = new Teacher(
                "BAMU",
                "BAMU",
                "Natasha",
                "ADF245GH56743",
                "JAVA,Python",
                "BCS 2nd Years",
                60000);

        // Display Teacher details
        System.out.println();
        System.out.println("----Teacher Details----");
        System.out.println("University Name: " + t1.getUniversityName());
        System.out.println("Teacher Name: " + t1.getTeacherName());
        System.out.println("Teacher ID: " + t1.getUniversityID());
        System.err.println("Teacher subjects: " + t1.getSubjects());
        System.out.println("Class Alloted: " + t1.getClassAllot());
        System.out.println(t1.getTeacherName() + ": Salary = " + t1.getSalary());


        // Create Staff object
        Staff st1 = new Staff(
                "BAMU",
                "Vasantrao Kale College Of Management Science Kallam",
                "Rakesh",
                "2019HDSJ246EM",
                "Cleaning",
                20000);

        // Display Staff details
        System.out.println();
        System.out.println("----Staff Details----");
        System.out.println("University Name: " + st1.getUniversityName());
        System.out.println("College Name: " + st1.getCollegeName());
        System.out.println("Staff Name: " + st1.getStaffName());
        System.out.println("Staff ID: " + st1.getStaffId());
        System.out.println("Staff Work: " + st1.getStaffWork());
        System.out.println(st1.getStaffName() + ": Salary = " + st1.getStaffSalary());
    }
}

/*
Output:

----Student Details----
University Name: BAMU
College Name: Vasantrao Kale College Of Management Science Kallam
Student PRN No: 2026749400
Student Name: Aliya
Student Age: 22
Student Phone no: 88453409
Student inrolled in course: BCS
Student current std/year: 2nd year
Student total year course: 3

----Teacher Details----
University Name: BAMU
Teacher Name: Natasha
Teacher ID: ADF245GH56743
Teacher subjects: JAVA,Python
Class Alloted: BCS 2nd Years
Natasha: Salary = 60000.0

----Staff Details----
University Name: BAMU
College Name: Vasantrao Kale College Of Management Science Kallam
Staff Name: Rakesh
Staff ID: 2019HDSJ246EM
Staff Work: Cleaning
Rakesh: Salary = 20000.0
*/