package Access2;
// Create two packages: `access1` and `access2`.
// In `access1`, create a `Parent` class with **private, default, protected, and public** variables.
// In `access2`, create a `Child` class that extends `Parent`.
// Try to access all four variables from `Child`.
// Then create a `Main` class in `access2` and try to access all four variables from `Main`.
// Observe which variables are accessible in each case.

public class AllAccessModifiers {
    public static void main(String[] args) {
        
        StudentsDetail s1 = new StudentsDetail();

        System.out.println("College Name: " + s1.collegeName); //  public accessible

        // System.out.println("College Class: " + s1.classStd); //  default not accessible

        // System.out.println("College Id: " + s1.collegeId); //  protected not accessible
        // Main is not a child class

        // System.out.println("College Number: " + s1.collegeNumber); // private not accessible

        s1.showStudentCollegeDetails();
    }
}

/*output:
College Name: ABC
College Name: ABC
College Id: 1010cl
 */

// Main is a normal class in a different package.
        // public    -> accessible
        // default   -> not accessible
        // protected -> not accessible
        // private   -> not accessible