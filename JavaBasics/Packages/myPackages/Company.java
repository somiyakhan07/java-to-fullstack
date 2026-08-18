// Package + Access Modifier

// Create a Company class inside one package with private, default, protected, and public members. 
// Create another class in a different package and check which members can be accessed directly.

package myPackages;

public class Company {

    private String companyName = "Google"; // private
    String location = "India";             // default
    protected String department = "IT";    // protected
    public String founder = "Larry";       // public
}