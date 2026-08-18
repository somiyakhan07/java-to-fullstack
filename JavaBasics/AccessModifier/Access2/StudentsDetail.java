// Create two packages: `access1` and `access2`.
// In `access1`, create a `Parent` class with **private, default, protected, and public** variables.
// In `access2`, create a `Child` class that extends `Parent`.
// Try to access all four variables from `Child`.
// Then create a `Main` class in `access2` and try to access all four variables from `Main`.
// Observe which variables are accessible in each case.

package Access2;

import Access1.College;

public class StudentsDetail extends College {

    public void showStudentCollegeDetails() {

        System.out.println("College Name: " + collegeName); //  public accessible

        // System.out.println("Class: " + classStd); //  default not accessible

        System.out.println("College Id: " + collegeId); //  protected accessible

        // System.out.println("College Number: " + collegeNumber); //  private not accessible
    }
}

// Child class is in a different package.
        // public    -> accessible
        // default   -> not accessible
        // protected -> accessible
        // private   -> not accessible