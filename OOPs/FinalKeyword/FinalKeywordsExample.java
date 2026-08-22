// Final Keyword Demo Create a small program containing:
// Final variable
// Final reference variable
// Final method
// Final class

class University {
    final String uniName = "Bamu";

    final public void details() {
        System.out.println("University Name: " + uniName);
    }
}

final class College extends University {
    private String collegeStaff;
    // private String collegeName = "SM SHEETY";

    // details() in College cannot override details() in University
    // public void details(){
    // System.out.println("College Name : " + collegeName);
    // }

    public String getCollegeStaff() {
        return collegeStaff;
    }

    public void setCollegeStaff(String collegeStaff) {
        this.collegeStaff = collegeStaff;
    }
}
// cannot inherit from final Class College
// class Student extends College {
// }

public class FinalKeywordsExample {
    public static void main(String[] args) {
        University u1 = new University();
        System.out.println("University Name: " + u1.uniName);

        // cannot assign a value to final variable uniName
        // u1.uniName = "OXFORD";

        final College c1 = new College();
        c1.setCollegeStaff("Mohan");
        System.out.println("College Staff Name: " + c1.getCollegeStaff());

        // cannot assign a value to final reference variable c1
        // c1 = new College();

    }

}

/* Output:
University Name: Bamu

College Staff Name: Mohan

-----------------------------
Final Keyword Rules:

final variable    → value cannot be changed
final reference   → reference cannot point to another object
final method      → cannot be overridden
final class       → cannot be inherited
*/