// Package + Access Modifier

// Create a Company class inside one package with private, default, protected, and public members. 
// Create another class in a different package and check which members can be accessed directly.

import myPackages.Company;

public class AccessTest {
    public static void main(String[] args) {

        Company c1 = new Company();

        // System.out.println(c1.companyName); // private cannot access
        // System.out.println(c1.location);    // default cannot access
        // System.out.println(c1.department);  // protected cannor access

        System.out.println(c1.founder); // public can access
    }
}